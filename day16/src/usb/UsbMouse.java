package usb;

public class UsbMouse implements USB {
	@Override
	public void doWork() {
		System.out.println("点击鼠标！");
	}
}
