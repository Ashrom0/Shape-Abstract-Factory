public class AbstractFactoryPatternDemo {
	public static void main(String[] args) {
		AbstractFactory shapeFactory = FactoryProducer.getFactory(false); // checks if the shape is not with shapefactory, makes it false
		AbstractFactory roundedshapeFactory = FactoryProducer.getFactory(true); // checksif shaoe is true with roundedshape
		
		Shape shape1 = shapeFactory.getShape("RECTANGLE");
		shape1.draw();
		
		Shape shape2 = shapeFactory.getShape("SQUARE");
		shape2.draw();
		
		Shape shape3 = roundedshapeFactory.getShape("ROUNDEDRECTANGLE");
		shape3.draw();
		
		Shape shape4 = roundedshapeFactory.getShape("ROUNDEDSQUARE");
		shape4.draw();
		
	}
}
