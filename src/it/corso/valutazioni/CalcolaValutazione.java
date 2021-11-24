package it.corso.valutazioni;

public class CalcolaValutazione {
	// Attributes
	int studentID;
	int absenceRate;
	double averageGrades;

	// Methods
	CalcolaValutazione(int studentID, int absenceRate, double averageGrades) {
		this.studentID = studentID;
		this.absenceRate = absenceRate;
		this.averageGrades = averageGrades;
	}

	boolean promotedOrRejected() {
		boolean rejected = false;

		if (absenceRate > 50) {
			rejected = true;
		} else if ((absenceRate >= 50 && absenceRate <= 25) && averageGrades > 2f) {
			rejected = true;
		} else if (absenceRate < 25 && averageGrades >= 2f) {
			rejected = false;
		} else if (averageGrades < 2f) {
			rejected = true;
		}

		return rejected;

	}
}
