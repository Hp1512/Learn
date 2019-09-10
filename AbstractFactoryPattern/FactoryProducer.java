package abstractFactory;

//ʹ�� FactoryProducer ����ȡ AbstractFactory��ͨ������������Ϣ����ȡʵ����Ķ���
public class FactoryProducer {
	public static AbstractFactory getFactory(String choice)
	{
		if(choice.equalsIgnoreCase("SHAPE"))
			return new ShapeFactory();
		else if(choice.equalsIgnoreCase("COLOR"))
			return new ColorFactory();
		return null;
	}

}
