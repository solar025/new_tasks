package org.example;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import  java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {


        int Field[] = {1, 0, 1, 2, 2, 1, 2, 0, 0};

        // Add keys and values (Country, City)

        byte a[] = {-128, -128, -128};

        for (int i = 0; i < 9; i++) {
            a[Field[i]] += (i+1)*(i+1);
        }
        FileUtils.writeByteArrayToFile(new File("C:\\Users\\workstation\\Documents\\qt\\sql\\file"), a);


    }
}