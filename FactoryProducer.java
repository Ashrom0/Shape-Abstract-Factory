public class FactoryProducer { // checks to see if shape is rounded, if is rounded, uses the RoundedShapeFactory method, else would use ShapeFactory
	public static AbstractFactory getFactory(boolean rounded) {
        if (rounded) {
            return new RoundedShapeFactory();//
        }
        return new ShapeFactory();
    }
}
