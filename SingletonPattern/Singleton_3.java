package singlePattern;

public class Singleton_3 {
	
	private static Singleton_3 instance=new Singleton_3();
	private static Singleton_3 getInstance(){
		return instance;
	}

}
