package com.fileoperations.polar;

import java.io.File;

import com.fileoperations.helper.FileHelper;

public class PolarCheck extends FileHelper implements Runnable {

	public void run() {
		while(true){
			File f = new File("D:/Ankush Zod/inputfiles");
			File list[] = f.listFiles();
			for(File file : list){
				if(!isValid() && isDupliacate() && !isOnTime()){
					file.delete();
					
				}
				else {
					
				}
			}
		}
		
	}

}
