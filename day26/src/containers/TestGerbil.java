package containers;

import java.util.ArrayList;

class Gerbil{
	private  int counter;
	private  final int gerbilNumber=counter++;
	
	public void hop() {
		System.out.println("gerbil "+gerbilNumber+" is Jumping...");
	}
}

public class TestGerbil {

	public static void main(String[] args) {
		ArrayList<Gerbil> gerbils=new ArrayList<Gerbil>();
		for(int i=0;i<3;i++) {
			gerbils.add(new Gerbil());
		}
		
		for(Gerbil c:gerbils) {
			c.hop();
		}

	}

}
