public class MainBag {
	public static void main (String[] args){
		Bags b = new SimpleBags();
		System.out.println("Types: "+b.getType());
		System.out.println("Price: "+b.getPrice());
		
		b = new Backpack(b);
		System.out.println("Types: "+b.getType());
		System.out.println("Price: "+b.getPrice());
		
		b = new Baguette(b);
		System.out.println("Types: "+b.getType());
		System.out.println("Price: "+b.getPrice());
		
		b = new ToteBag(b);
		System.out.println("Types: "+b.getType());
		System.out.println("Price: "+b.getPrice());
		
		b = new DuffelBag(b);
		System.out.println("Types: "+b.getType());
		System.out.println("Price: "+b.getPrice());
	}
}
