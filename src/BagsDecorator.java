public abstract class BagsDecorator extends Bags{
	public BagsDecorator (Bags decorator){
		this.decorator=decorator;
	}
	
	public String getType(){
		return decorator.getType();
	}
	
	public double getPrice(){
		return decorator.getPrice();
	}
}