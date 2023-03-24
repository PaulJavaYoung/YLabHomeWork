package com.oldboy.tasks.Lesson3.OuterMergeSort.MyClasses;

import java.io.*;

public class TemporaryFileBuffer {
    public BufferedReader buffReader;
    public File originalTempFile;
    private String cachedStringForRead;
    private boolean allStringRead;

    public TemporaryFileBuffer(File tempFileForReadAndCompare) throws IOException {
        originalTempFile = tempFileForReadAndCompare;
        buffReader = new BufferedReader(new FileReader(tempFileForReadAndCompare));
        reload();
    }

    public boolean empty() {
        return allStringRead;
    }

    private void reload() throws IOException {
        try {
            if((this.cachedStringForRead = buffReader.readLine()) == null){
                allStringRead = true;
                cachedStringForRead = null;
            }
            else{
                allStringRead = false;
            }
        } catch(EOFException oef) {
            allStringRead = true;
            cachedStringForRead = null;
        }
    }

    public void close() throws IOException {
        buffReader.close();
    }

    public String peek() {
        if(empty()) {
            return null;
        }
        return cachedStringForRead;
    }
    public String pop() throws IOException {
        String answer = peek();
        reload();
        return answer;
    }
}