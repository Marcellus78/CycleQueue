package com.cyclequeue;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class QueueMain {

	public static void main(String[] args) {
		
		int handlingTime; //czas ob³ugi okienka
		int timeOfWork; //czas otwarcia w minutach
		
		List<Integer> lista = new LinkedList<>();
		
		MailCounter[] okienka  = new MailCounter[3];
		
		okienka[0] = new MailCounter(1,4);
		okienka[1] = new MailCounter(2,4);
		okienka[2] = new MailCounter(3,4);
		
		for(int i=0;i<99;i++) {
			lista.add(i+101);
		}
		
		ListIterator<Integer> listIter = lista.listIterator();
		int suma=0;
		while(listIter.hasNext()) {
			
			handlingTime = getRandomNumber(1,10);
			System.out.println(listIter.next() + " " + handlingTime 
					+ "min." );
			suma += handlingTime;
			
			//if(!listIter.hasNext()) {
			//	listIter=lista.listIterator();
			//}
		}
		System.out.println("Czas ca³kowity obs³ugi: " + (suma/60) + "godz.");
	}
	
	//metoda prywatna do generowania liczb losowych z podanego zakresu 
	private static int getRandomNumber(int min, int max) {
		
		Random r = new Random();
		return r.ints(min, (max+1)).findFirst().getAsInt();
	}

}
