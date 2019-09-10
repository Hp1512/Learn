package singlePattern;

//Ë«¼ìËø/Ë«ÖØÐ£ÑéËø
public class Singleton_4 {
	private volatile static Singleton_4 singleton;
	private Singleton_4(){}
	public static Singleton_4 getSingleton(){
		if(singleton==null)
			synchronized (Singleton_4.class){
			if(singleton==null)
				singleton=new Singleton_4();
			}
		return singleton;
	}
	

}
