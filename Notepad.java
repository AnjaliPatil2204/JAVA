package threads.app;

import java.io.IOException;

public class Notepad {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Start");
		Runtime rt = Runtime.getRuntime();
		Process process = rt.exec("notepad");
		int Status = process.waitFor();
		System.out.println("status"+Status);
		System.out.println("End");

	}

}
