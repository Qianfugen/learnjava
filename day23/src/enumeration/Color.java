package enumeration;

public enum Color {
	RED("红色",1),GREEN("绿色",2),YELLOW("黄色",3);
	//成员变量
	private String name;
	private int index;
	
	//构造方法
	private Color(String name,int index) {
		this.name=name;
		this.index=index;
	}
	//覆盖方法
	public String toString() {
		return this.index+"_"+this.name;
	}
}
