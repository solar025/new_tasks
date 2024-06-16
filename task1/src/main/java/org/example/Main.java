package org.example;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import  java.lang.Object;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        createBackup("C:\\Users\\workstation\\Documents\\qt\\sql");
    }

    public static void createBackup(String path){

        File source = new File(path);
        File dest = new File(path+"\\backup");
        new File(path+"\\backup").mkdirs();
        try {
            FileUtils.copyDirectory(source, dest);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}