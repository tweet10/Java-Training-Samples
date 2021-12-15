package com.java.FileSamples;

import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class TextAppend {
   public static void main( String[] args ) {

      try {
         String data = "Hello All!!";
         File f1 = new File("MyFileSample.txt");
         if(!f1.exists()) {
            f1.createNewFile();
         }

         FileWriter fileWritter = new FileWriter(f1.getName(),true);
         BufferedWriter bw = new BufferedWriter(fileWritter);
         bw.write(data);
         bw.close();
         System.out.println(data);
      } catch(IOException e){
         e.printStackTrace();
      }
   }
}