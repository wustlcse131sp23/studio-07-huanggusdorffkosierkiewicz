package studio7;

public class Die {
	
	private int n;
	
	public Die (int n) {
		this.n= n;
				
	}
	
	public int whichNumber () {
		
		return (int)(Math.random()*n + 1);
	}
	
	public static void main(String[]args) {
		Die roll = new Die (6);
		System.out.println(roll.whichNumber());
	}

}
