package com.oldboy.tasks.Lesson3.OuterMergeSort.MyClasses;

import java.io.*;
import java.util.*;

public class Sorter {
    // Максимальное количество строк во временных файлах
    private static final int MAX_ROW_IN_FILE = 62218;
    private static List<File> tempFilesList;
    private static final File dirForFile =
            new File("src\\com\\oldboy\\tasks\\Lesson3\\OuterMergeSort\\FileForSorted\\");
    private static final File outputFile =
            new File("src\\com\\oldboy\\tasks\\Lesson3\\OuterMergeSort\\SortedFile\\data_sorted.txt");

    public File sortFile(File inputFile) throws IOException {

        int tempFileAmount = chunkCalculator(inputFile);

        temporaryFileMaker(inputFile,tempFileAmount);

        for (File tempFile : tempFilesList) {
            sortTempFile(tempFile);
        }
        Comparator<Long> comparator = new Comparator<>() {
            public int compare(Long r1, Long r2) {
                return r1.compareTo(r2);
            }
        };
        mergeSortedFiles(tempFilesList, comparator);

        return outputFile;
    }

    private static int chunkCalculator(File inputFile){
        tempFilesList = new ArrayList<>();
        long fileSize = inputFile.length();
        long chunkSize = MAX_ROW_IN_FILE * 30;
        long countOfChunk = fileSize / chunkSize;
        return (countOfChunk < 1 && (fileSize % chunkSize) > 0) ?
                1 : (int) (countOfChunk + 1);
    }

    private static void temporaryFileMaker(File inputFile, int chuCount){
        try (Scanner scanner = new Scanner(new FileInputStream(inputFile))) {
            for (int i = 0; i < chuCount; i++) {
                File tempFile = File.createTempFile(i + "_sort", "temp", dirForFile);
                tempFilesList.add(tempFile);
                try (PrintWriter pw = new PrintWriter(tempFile)) {
                    int counter = 0;
                    while (scanner.hasNextLong()) {
                        pw.println(scanner.nextLong());
                        pw.flush();
                        if (i == chuCount -1) {

                        } else if ((counter++) >= MAX_ROW_IN_FILE){
                            break;
                        }
                    }
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void sortTempFile(File tempFile){

        List<Long> listSort = new ArrayList<>();

        try (Scanner scanner = new Scanner(new FileInputStream(tempFile))) {
            while (scanner.hasNextLong()) {
                long current = scanner.nextLong();
                listSort.add(current);
            }

            Collections.sort(listSort);

            try (PrintWriter pw = new PrintWriter(tempFile)) {
                for (int i = 0; i < listSort.size(); i++) {
                    pw.println(listSort.get(i));
                }
                pw.flush();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private static void mergeSortedFiles(List<File> files,
                                         final Comparator<Long> cmp) throws IOException {
        PriorityQueue<TemporaryFileBuffer> pq =
                new PriorityQueue<>(11, new Comparator<>() {
                    public int compare(TemporaryFileBuffer i, TemporaryFileBuffer j) {
                        return cmp.compare(Long.parseLong(i.peek()), Long.parseLong(j.peek()));
                    }
                });
        for (File tempFile : files) {
            TemporaryFileBuffer tempFileBuffStartState = new TemporaryFileBuffer(tempFile);
            pq.add(tempFileBuffStartState);
        }
        PrintWriter pw = new PrintWriter(Sorter.outputFile);
        try {
            while (pq.size() > 0) {
                TemporaryFileBuffer tempFileBuf = pq.poll();
                Long longToFile = Long.parseLong(tempFileBuf.pop());
                pw.println(longToFile);
                pw.flush();
                if (tempFileBuf.empty()) {
                    tempFileBuf.buffReader.close();
                    tempFileBuf.originalTempFile.delete();
                } else {
                    pq.add(tempFileBuf);
                }
            }
        } finally {
            for (TemporaryFileBuffer temporaryFileBuffer : pq) temporaryFileBuffer.close();
        }
    }
}