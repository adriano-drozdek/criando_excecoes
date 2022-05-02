package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Projeto {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Número do quarto: ");
		int numeroQuarto = sc.nextInt();
		System.out.println("Data de entrada: ");
		Date dataEntrada = sdf.parse(sc.next());
		System.out.println("Data saída: ");
		Date dataSaida = sdf.parse(sc.next());

		sc.close();

	}

}
