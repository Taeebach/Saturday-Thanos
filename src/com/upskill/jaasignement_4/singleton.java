package com.upskill.jaasignement_4;

public class singleton {

		
		// Singleton is class that can have only one object
		
		// Private constructor, it prevents any other class from instantiating
		private singleton(){
			
		}
		
		//Private static object of the class
		private static singleton SingletonObj = new singleton();
		
		//Static instance method
		public static singleton getInstance(){
			return SingletonObj;
		}
		
		protected static void demo(){
			System.out.println("Demo method for singletone class");
		}
	}


	
		
	


	
	
		

	


