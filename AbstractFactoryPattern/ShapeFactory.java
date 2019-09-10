package abstractFactory;

//������չ�� AbstractFactory �Ĺ����࣬���ڸ�������Ϣ����ʵ����Ķ���
public  class ShapeFactory extends AbstractFactory {
	@Override
	public Shape getShape(String shapeType)
	{
		if(shapeType==null)
			return null;
		if(shapeType.equalsIgnoreCase("CIRCLE"))
			return new Circle();
		else if(shapeType.equalsIgnoreCase("RECTANGLE"))
			return new Rectangle();
		else if(shapeType.equalsIgnoreCase("AQUARE"))
			return new Square();
		return null;
	}

	@Override
	public Color getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}

}
