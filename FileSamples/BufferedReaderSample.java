package com.java.FileSamples;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReaderSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
            FileWriter writer = new FileWriter("MyFileSample.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
 
            bufferedWriter.write("Hello HCL, Have a Great Year");
          
 
            bufferedWriter.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        }

	}

}
