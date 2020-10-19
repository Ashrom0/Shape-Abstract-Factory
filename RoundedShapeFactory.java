public class RoundedShapeFactory extends AbstractFactory { // //identifys what specific rounded shape it will be.
	public Shape getShape(String shapeType) {
		if(shapeType == null) {
			return null;
		}
		else if(shapeType.equalsIgnoreCase("ROUNDEDSQUARE")) {
			return new RoundedSquare();
		}
		else if(shapeType.equalsIgnoreCase("ROUNDEDRECTANGLE")) {
			return new RoundedRectangle();
		}
		
		return null;
	}
}
