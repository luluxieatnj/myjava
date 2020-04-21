package com.xll.iotest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class IOTest1 {
    public static void main(String[] args) {

        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(new File("")));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
