package com.java.FileSamples;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class FileLongestWord {
     public static void main(String [ ] args) throws FileNotFoundException {
              new FileLongestWord().findLongestWords();
         }

     public String findLongestWords() throws FileNotFoundException {

       String longestWord = "";
       String current;
       Scanner sc = new Scanner(new File("MyFileSample.txt"));


       while (sc.hasNext()) {
          current = sc.next();
           if (current.length() > longestWord.length()) {
             longestWord = current;
           }

       }
         System.out.println("\n"+longestWord+"\n");
            return longestWord;
            }
}