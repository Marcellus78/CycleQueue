package com.marcellus.cyclequeue;

public class MailCounter {

	private int number; //numer stanowiska
	private int hoursOfWork;//czas pracy
	
	public MailCounter(int number,int hours) {
		this.number = number;
		this.hoursOfWork = hours;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getHoursOfWork() {
		return hoursOfWork;
	}

	public void setHoursOfWork(int hoursOfWork) {
		this.hoursOfWork = hoursOfWork;
	}
	
	
}
