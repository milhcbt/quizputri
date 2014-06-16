public class Baguette extends BagsDecorator{
	public Baguette (Bags decorator){
		super(decorator);
	}
	
	public String getType(){
		return super.getType()+""+"Baguette";
	}
	
	public double getPrice(){
		return super.getPrice()+""+715000;
	}
}