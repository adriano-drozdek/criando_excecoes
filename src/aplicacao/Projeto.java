package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reserva;

public class Projeto {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Número do quarto: ");
		int numero = sc.nextInt();
		System.out.print("Data de entrada: ");
		Date dataEntrada = sdf.parse(sc.next());
		System.out.print("Data saída: ");
		Date dataSaida = sdf.parse(sc.next());

		if (!dataSaida.after(dataEntrada)) {
			System.out.println("Erro na reserva, data de saída deve ser depois da data de entrada!  ");
		} 
		else {
			Reserva reserva = new Reserva(numero, dataEntrada, dataSaida);
			System.out.println("Reserva: " + reserva);

			System.out.println();
			System.out.println("Entre com a nova data da reserva: ");
			System.out.print("Data de entrada: ");
			dataEntrada = sdf.parse(sc.next());
			System.out.print("Data saída: ");
			dataSaida = sdf.parse(sc.next());

			reserva.atualizarData(dataEntrada, dataSaida);
			System.out.println("Reserva: " + reserva);

		}
		sc.close();

	}

}
