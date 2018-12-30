package com.company;

public class Main {

    public static void main(String[] args) {
	    String origFilePath = "C:\\program.exe";
        String copyFilePath = "C:\\testFolder\\program.exe";

        fileManager FM = new fileManager();
        double[] copyState = new double[2];
        copyState = FM.copy(origFilePath,copyFilePath);

        System.out.println("File was copied with speed "+copyState[0]+"MB/S by "+ copyState[1]+" seconds");
    }
}
