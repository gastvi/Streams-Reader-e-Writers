package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class TesteCopiarArquivo {

	public static void main(String[] args) throws IOException {
		
//		Novamente no projeto java-io, no pacote br.com.alura.java.io.teste, copie a classe 
//		TesteLeitura, dando o nome TesteCopiarArquivo. Após isso, na classe TesteCopiarArquivo, 
//		com a leitura do arquivo já feita, estabeleça o fluxo de escrita
//		
//		InputStream fis = new FileInputStream("lorem.txt");
//        Reader isr = new InputStreamReader(fis);
//        BufferedReader br = new BufferedReader(isr);
//
//        OutputStream fos = new FileOutputStream("lorem2.txt");
//        Writer osw = new OutputStreamWriter(fos);
//        BufferedWriter bw = new BufferedWriter(osw);
//
//        String linha = br.readLine();
//
//        while (linha != null) {
//            System.out.println(linha);
//            linha = br.readLine();
//        }
//
//        br.close();
//    }

//
//
//-------------------------------------------------------------------------------------------
//	A leitura do arquivo já está sendo feita. Agora, ao invés de imprimir a linha no console, escreva-a no arquivo. 
//  Não esqueça de criar uma nova linha e de fechar o BufferedWriter:
//	
//	InputStream fis = new FileInputStream("lorem.txt");
//    Reader isr = new InputStreamReader(fis);
//    BufferedReader br = new BufferedReader(isr);
//
//    OutputStream fos = new FileOutputStream("lorem2.txt");
//    Writer osw = new OutputStreamWriter(fos);
//    BufferedWriter bw = new BufferedWriter(osw);
//
//    String linha = br.readLine();
//
//    while (linha != null) {
//        bw.write(linha);
//        bw.newLine();
//        linha = br.readLine();
//    }
//
//    br.close();
//    bw.close();
//}
//		
//		
//-------------------------------------------------------------------------------------------
//	A leitura não necessariamente precisa ser de um arquivo. Acima, se você utilizar o 
//	System.in, você irá gravar no arquivo o que o usuário digitar. Mas para conseguir 
//	parar o console, verifique também se a linha não estará vazia. Teste:
//	
//		InputStream fis = System.in;
//        Reader isr = new InputStreamReader(fis);
//        BufferedReader br = new BufferedReader(isr);
//
//        OutputStream fos = new FileOutputStream("lorem2.txt");
//        Writer osw = new OutputStreamWriter(fos);
//        BufferedWriter bw = new BufferedWriter(osw);
//
//        String linha = br.readLine();
//
//        while (linha != null && !linha.isEmpty()) {
//            bw.write(linha);
//            bw.newLine();
//            linha = br.readLine();
//        }
//
//        br.close();
//        bw.close();
//    }
//
//-------------------------------------------------------------------------------------------
//	Do contrário, com o System.out, você consegue imprimir no console o que foi lido. 
//	Para tal, assim que criar uma nova linha, dê um flush no BufferedWriter. 
//	Por exemplo:
//
		InputStream fis = System.in;
		Reader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);

		OutputStream fos = System.out;
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);

		String linha = br.readLine();

		while (linha != null && !linha.isEmpty()) {
			bw.write(linha);
			bw.newLine();
			bw.flush();
			linha = br.readLine();
		}

		br.close();
		bw.close();
	}

}
