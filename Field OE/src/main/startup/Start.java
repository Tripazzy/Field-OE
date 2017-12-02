package main.startup;

import main.setup.Create;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Start {
	public static Scanner read;
	public static void main(String[] args) {
		try {
			read = new Scanner(new File("src/save.txt"));
			read.close();
			Login.start();
		} catch (FileNotFoundException e) {
			Create.intro();
		}
	}
}
