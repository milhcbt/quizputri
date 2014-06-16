public class ToteBag extends BagsDecorator{
	public ToteBag (Bags decorator){
		super(decorator);
	}
	
	public String getType(){
		return super.getType()+""+"ToteBag";
	}
	
	public double getPrice(){
		return super.getPrice()+""+672000;
	}
}