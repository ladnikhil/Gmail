package com.dev.arrays;

import java.io.File;
import java.io.IOException;

public class FilesCommonsUtil {

	public static void main(String[] args) {
		
		File file = new File("D:/Text.txt");
		FileUtils.touch(file);// to create a file
		
		if(file.exists()) {
			System.out.println("file exists");
		}else {
			System.out.println("file doesnot exist");
		}

		
		FileUtils.deleteQuietly(file);// to delete a file
	}

}
