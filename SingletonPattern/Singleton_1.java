package singlePattern;

//����ʽ���̲߳���ȫ
public class Singleton_1 {

	private static Singleton_1 instance;
	private Singleton_1(){}
	public static Singleton_1 getInstance(){
		if(instance==null)
			instance= new Singleton_1();
		return instance;
	}
}
