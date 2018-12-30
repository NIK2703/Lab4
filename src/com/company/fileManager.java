package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class fileManager  {
    final int fourByte = 4096;

    double[] copy(String orig, String copy){
        double[] state = new double[2];//[0] - middle copy speed (MB per second); [1] - copy time

        try{
            FileInputStream origFS = new FileInputStream(orig);
            FileOutputStream copyFS = new FileOutputStream(copy);

            byte[] buffer = new byte[fourByte];
            int len;

            long startCopyTime = System.currentTimeMillis();
            long totalFileSizeByte = 0;

            while((len = origFS.read(buffer))>0){
                copyFS.write(buffer);
                totalFileSizeByte+=len;
            }

            long endCopyFile = System.currentTimeMillis();
            long copyTime = endCopyFile-startCopyTime;

            state[1] = ((double) copyTime)/1000;
            try {
                state[0] = ((double)totalFileSizeByte/1000)/ copyTime;
            }
            catch(ArithmeticException e){
                state[0] = 0;
            }
            finally{
                origFS.close();
                copyFS.close();
            }

        }catch (FileNotFoundException e){

        }
        catch (IOException e){

        }

        return state;
    }
}
