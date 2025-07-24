package file;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileCreate {
	public static void main(String[] args) throws Throwable {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter source path:");
		String src = sc.next();
		
		File file = new File(src);
		boolean sucess = file.createNewFile();
		System.out.println("Success-------");
	}

}
