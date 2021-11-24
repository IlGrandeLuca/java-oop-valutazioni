package it.corso.valutazioni;

public class CalcolaValutazione {
	// Attributes
	int studentID;
	int absenceRate;
	float averageGrades;

	// Methods
	CalcolaValutazione(int studentID, int absenceRate, float averageGrades) {
		this.studentID = studentID;
		this.absenceRate = absenceRate;
		this.averageGrades = averageGrades;
	}

	boolean promotedOrRejected() {
		boolean rejected = false;

		if (absenceRate > 50) {
			rejected = true;
		} else if ((absenceRate >= 50 && absenceRate <= 25) && averageGrades > 2) {
			rejected = true;
		} else if (absenceRate < 25 && averageGrades >= 2) {
			rejected = false;
		}

		return rejected;

	}
}
