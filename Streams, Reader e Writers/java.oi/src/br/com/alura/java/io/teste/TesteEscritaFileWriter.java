package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaFileWriter {

	public static void main(String[] args) throws IOException {
//
//		FileWriter fw = new FileWriter("lorem2.txt");
//
//		fw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
//		fw.write(System.lineSeparator());
//		fw.write("tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam");
//
//		fw.close();
//
//		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem3.txt"));
//
//		bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
//		bw.newLine();
//		bw.write("tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam");
//
//		bw.close();

//-------------------------------------------------------------------------------------------------------------------
		long ini = System.currentTimeMillis();

		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));

		bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		bw.newLine();
		bw.write("tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam");

		bw.close();

		long fim = System.currentTimeMillis();

		System.out.println("Passaram " + (fim - ini) + " milissegundos");

	}
}
