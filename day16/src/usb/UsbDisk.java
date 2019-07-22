package usb;

public class UsbDisk implements USB {

	@Override
	public void doWork(){
		System.out.println("存储文件");
	}

}
