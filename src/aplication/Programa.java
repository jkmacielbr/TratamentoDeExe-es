package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;
import model.excepetions.DomainException;

public class Programa {

	public static void main(String[] args) throws ParseException {

		Scanner teclado = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		try {
		System.out.println("Room Number");
		int number = teclado.nextInt();
		System.out.println("Check-in date (dd/MM/yyyy");
		Date checkIn = sdf.parse(teclado.next());
		System.out.println("Check-out date (dd/MM/yyyy");
		Date checkOut = sdf.parse(teclado.next());

		Reservation reservation = new Reservation(number, checkIn, checkOut);
		System.out.println("Reservation" + reservation);

		System.out.println("Enter Data to update the reservation: ");
		System.out.println("Check-in date (dd/MM/yyyy");
		checkIn = sdf.parse(teclado.next());
		System.out.println("Check-out date (dd/MM/yyyy");
		checkOut = sdf.parse(teclado.next());
		reservation.updateDates(checkIn, checkOut);
		System.out.println("Reservation" + reservation);
		}
		catch (ParseException e) {
			System.out.println("Invalid date format");
		}
		catch (DomainException e) {
			System.out.println("Error in reservation: " + e.getMessage());
		}
		teclado.close();

	}

}
