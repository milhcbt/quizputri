public class Backpack extends BagsDecorator{
	public Backpack (Bags decorator){
		super(decorator);
	}
	
	public String getType(){
		return super.getType()+""+"Backpack";
	}
	
	public double getPrice(){
		return super.getPrice()+""+125000;
	}
}