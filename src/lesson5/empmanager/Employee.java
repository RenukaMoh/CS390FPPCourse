package lesson5.empmanager;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.GregorianCalendar;

public class Employee {
	// instance fields
	private String name;
	private double salary;
	private LocalDate hireDay;

	// constructor
	Employee(String aName, double aSalary, int aYear, int aMonth, int aDay) {
		name = aName;
		salary = aSalary;
		hireDay = LocalDate.of(aYear,aMonth,aDay);
	}
	// instance methods
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	public String getHireDay() {
		final String DATE_PATTERN = "MM/dd/yyyy";

		return hireDay.format(DateTimeFormatter.ofPattern(DATE_PATTERN));
	}
	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += raise;
	}
}
