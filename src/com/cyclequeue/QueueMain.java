package com.cyclequeue;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class QueueMain {

	public static void main(String[] args) {
		
		int handlingTime; //czas ob³ugi okienka
		int timeOfWork; //czas otwarcia w minutach
		
		List<Integer> lista = new LinkedList<>();
		
		for(int i=0;i<99;i++) {
			lista.add(i+101);
		}
		
		ListIterator<Integer> listIter = lista.listIterator();
		
		while(listIter.hasNext()) {
			
			
			System.out.println(listIter.next());
			//if(!listIter.hasNext()) {
			//	listIter=lista.listIterator();
			//}
		}
	}

}
