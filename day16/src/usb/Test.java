package usb;

public class Test {
	public static void main(String[] args) {
		UsbFan fan=new UsbFan();
		fan.doWork();
		
		UsbDisk disk=new UsbDisk();
		disk.doWork();
		
		UsbMouse mouse=new UsbMouse();
		mouse.doWork();
	}
}
