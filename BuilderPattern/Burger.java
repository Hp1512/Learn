package builderPattern;

//����ʵ�� Item �ӿڵĳ����࣬�����ṩ��Ĭ�ϵĹ��ܡ�
public abstract class Burger implements Item {

	@Override
	public Packing packing(){
		return new Wrapper();
	}
	
	@Override
	public abstract float price();
}
