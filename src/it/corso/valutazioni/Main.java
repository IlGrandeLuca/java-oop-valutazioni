package it.corso.valutazioni;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		CalcolaValutazione[] grades = new CalcolaValutazione[20];

		for (int i = 0; i < grades.length; i++) {
			grades[i] = new CalcolaValutazione(i + 1, r.nextInt(100) + 1, r.nextDouble(5));

			System.out.print("Student ID: " + grades[i].studentID + " - ");
//			System.out.print("Student ID: " + grades[i].studentID + " " + grades[i].absenceRate + " "
//					+ String.format("%.1f", grades[i].averageGrades) + " - ");
			if (grades[i].promotedOrRejected()) {
				System.out.println("rejected");
			} else {
				System.out.println("promoted");
			}
		}
	}

}
