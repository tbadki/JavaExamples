package com.java.examples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.lang.Integer;

public class MyConsumer {

	public static void main1(String[] args) {
		
		//creating sample Collection
		List<Integer> myList = new ArrayList<Integer>();
		for(int i=0; i<10; i++) myList.add(i);
		System.out.println("Values in list : "+ myList);
		
		//traversing using Iterator
		Iterator<Integer> it = myList.iterator();
		while(it.hasNext()){
			Integer i = it.next();
			System.out.println("Iterator Value::"+i);
		}
		
		//traversing through forEach method of Iterable with anonymous class
		myList.forEach(new Consumer<Integer>() {

			public void accept(Integer t) {
				System.out.println("forEach anonymous class Value::"+t);
			}

		});
		
		//traversing with Consumer interface implementation
		MyConsumer1 action = new MyConsumer1();
		myList.forEach(action);
	
}


//Consumer implementation that can be reused
class MyConsumer1 implements Consumer<Integer>{

	public void accept(int t) {
		System.out.println("Consumer impl Value::"+t);
	}

	@Override
	public void accept(Integer t) {
		// TODO Auto-generated method stub

		System.out.println("Tushar Consumer impl Value::"+t);
	}
}


	public static void main(String[] arg)
	{
		List<String> tusList = new ArrayList<>();
		tusList.add("a");
		tusList.add("b");
		tusList.add("c");
	
		tusList.forEach(new Consumer<String>() {
			
			@Override
			public void accept(String t) {
				tusList.remove(t);  //concurrent modification exception -> can't modify list in between
				
				System.out.println("Tushar List : "+t);
				//tusList.add("Manjusha");
			}
		});
		
		ConsumerTest consumerTest = new ConsumerTest();
		tusList.forEach(consumerTest);
		
	}
	
	
	class ConsumerTest implements Consumer<String>
	{
		@Override
		public void accept(String t) {
			System.out.println("Tushar List : "+t);
		}
	}
}
