public class DuffelBag extends BagsDecorator{
	public DuffelBag (Bags decorator){
		super(decorator);
	}
	
	public String getType(){
		return super.getType()+""+"DuffelBag";
	}
	
	public double getPrice(){
		return super.getPrice()+""+1290000;
	}
}