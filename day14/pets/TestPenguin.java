package pets;

public class TestPenguin {
	public static void main(String[] args) {
		Penguin pg=new Penguin("QQ",60,88,"雌");
		pg.print();
		
		Penguin pg2=new Penguin();
		pg2.print();
	}
}
