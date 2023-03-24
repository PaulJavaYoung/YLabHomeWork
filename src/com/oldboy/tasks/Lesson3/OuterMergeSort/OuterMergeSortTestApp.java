package com.oldboy.tasks.Lesson3.OuterMergeSort;

import com.oldboy.tasks.Lesson3.OuterMergeSort.MyClasses.Sorter;
import com.oldboy.tasks.Lesson3.OuterMergeSort.WorkClasses.Generator;
import com.oldboy.tasks.Lesson3.OuterMergeSort.WorkClasses.Validator;

import java.io.File;
import java.io.IOException;

public class OuterMergeSortTestApp {
    public static void main(String[] args) throws IOException {

        String fileForLoadData = "src\\com\\oldboy\\tasks\\Lesson3\\OuterMergeSort\\FileForSorted\\data.txt";

        File dataFile = new Generator().generate(fileForLoadData, 18410);
        System.out.println(new Validator(dataFile).isSorted()); // false
        File sortedFile = new Sorter().sortFile(dataFile);
        System.out.println(new Validator(sortedFile).isSorted()); // true
    }
}
