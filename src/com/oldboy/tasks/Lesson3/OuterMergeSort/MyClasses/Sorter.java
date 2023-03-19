package com.oldboy.tasks.Lesson3.OuterMergeSort.MyClasses;

import java.io.*;
import java.util.*;

public class Sorter {
    // Максимальное количество строк во временных файлах
    private static final int MAX_ROW_IN_FILE = 10000;
    private static final File dirForFile =
            new File("src\\com\\oldboy\\tasks\\Lesson3\\OuterMergeSort\\FileForSorted\\");
    private static final File outputFile =
            new File("src\\com\\oldboy\\tasks\\Lesson3\\OuterMergeSort\\SortedFile\\data_sorted.txt");

    public File sortFile(File inputFile) throws IOException {
        List<File> tempFiles = new ArrayList<>();
        long fileSize = inputFile.length();
        int chunkSize = MAX_ROW_IN_FILE * 23;
        int chunks = (int) Math.ceil((double) fileSize / chunkSize);

        try (Scanner scanner = new Scanner(new FileInputStream(inputFile))) {
            for (int i = 0; i < chunks; i++) {
                File tempFile = File.createTempFile(i + "_sort", "temp", dirForFile);
                tempFiles.add(tempFile);
                try (PrintWriter pw = new PrintWriter(tempFile)) {
                    int counter = 0;
                    while (scanner.hasNextLong()) {
                        pw.println(scanner.nextLong());
                        pw.flush();
                        if ((counter++) >= MAX_ROW_IN_FILE) {
                            break;
                        }
                    }
                }
            }
        }

        for (File tempFile : tempFiles) {
            sortTempFile(tempFile);
        }


        Comparator<Long> comparator = new Comparator<>() {
            public int compare(Long r1, Long r2) {
                return r1.compareTo(r2);
            }
        };

        mergeSortedFiles(tempFiles, outputFile, comparator);

        return outputFile;
    }

    private static void sortTempFile(File tempFile) throws IOException {

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
                                         File outputfile,
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
        PrintWriter pw = new PrintWriter(outputfile);
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