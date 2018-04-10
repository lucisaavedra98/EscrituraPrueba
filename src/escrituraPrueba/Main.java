package escrituraPrueba;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) {
		FileWriter file = null;
		PrintWriter pw = null;
		String ruta = "archivoPrueba.txt";

		try {
			file = new FileWriter(ruta);

			pw = new PrintWriter(file);
			pw.println("Prueba de escritura en fichero");
			pw.close();

		} catch (IOException e) {
			e.printStackTrace();
			pw.close();
		}

	}
}
