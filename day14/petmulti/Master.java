package petmulti;

public class Master {
	public void cure(Dog dog) {
		if(dog.getHealth()<50) {
			System.out.println("打针，吃药！");
			dog.setHealth(60);
		}
	}
	
	public void cure(Penguin pg) {
		if(pg.getHealth()<50) {
			System.out.println("吃药，疗养！");
			pg.setHealth(60);
		}
	}
	
//	public void cure(Pet pet) {
//		if(pet.getHealth()<50) {
//			if(pet.getHealth()<50) {
//				pet.toHospital();
//			}
//		}
//	}
	
	public void play(Pet pet) {
		if(pet instanceof Dog) {
			((Dog) pet).catchingFlyDisk();
		}else if(pet instanceof Penguin) {
			((Penguin)pet).swimming();
		}
	}
}
