package org.example;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import  java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {


        int Field[] = {1, 0, 1, 2, 2, 1, 2, 0, 0};

        HashMap<Integer, String> Pieces = new HashMap<Integer, String>();

        // Add keys and values (Country, City)
        Pieces.put(0, " ");
        Pieces.put(1, "X");
        Pieces.put(2, "0");

        for (int l = 0; l < 3; l++) {
            System.out.println(Pieces.get(Field[l * 3]) + Pieces.get(Field[1 + l*3]) + Pieces.get(Field[2 + l*3]));
        }
    }
}