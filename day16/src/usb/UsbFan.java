package usb;

public class UsbFan implements USB {
	
	@Override
	public void doWork(){
		System.out.println("吹风");
	}
}
