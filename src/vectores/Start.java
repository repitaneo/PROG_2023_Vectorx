package vectores;

public class Start {

	public static void main(String[] args) {

		Vectorx v = new Vectorx();
		v.add(2);
		v.add(100);
		v.add(7);
		v.add(8);
		v.add(100);
		v.add(20);
		v.add(100);
		v.add(100);
		v.add(650);
		
		
		int donde = v.buscar(100, 0);
		while(donde!=-1) {
			
			System.out.println(donde);
			donde = v.buscar(100, donde+1);
		}
		
		
		
		

		
		
		
		
		
		//System.out.println((int)(Math.random()*11));
		
		
		
		
		
		
		
		
		

	}

}
