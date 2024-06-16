package org.example;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import  java.lang.Object;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        byte a[] = {-128+255, -128+30, -128};

        int i = a[0]+128;
        int j = a[1]+128;
        int k = a[2]+128;

        ArrayList<String> Field = new ArrayList<>();

        for (int t = 9; t > 0; t--) {
            if (i > j & i > k) {
                i -= t*t;
                Field.add(0, "X");
            }
            else if (j > i & j > k) {
                j -= t*t;
                Field.add(0, "0");
            }
            else {
                k -= t*t;
                Field.add(0, " ");
            }
        }

    }

}