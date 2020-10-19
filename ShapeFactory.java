public class ShapeFactory extends AbstractFactory{ //identifys what specific shape it will be.
	public Shape getShape(String shapeType) {
		if(shapeType == null) {
			return null;
		}
		else if(shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}
		else if(shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		}
		
		return null;
	}
}
