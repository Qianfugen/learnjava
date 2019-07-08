package cn.zlxy;

public class Pay {
	public static void main(String[] args) {
		//列表清单
		double shoesPrice = 329.9;
		double shirtPrice = 78.5;
		double footBallPrice = 199.0;
		int shoesNum = 2;
		int shirtNum = 5;
		int footBallNum = 1;
		//计算总额
		double sum;
		sum = shoesPrice*shoesNum + shirtPrice*shirtNum + footBallPrice*footBallNum;
		//打印小票
		System.out.println("-------购物清单-------");
		System.out.print("商品\t单价\t数量\n");
		System.out.printf("%s\t%s\t%d\n","鞋子",shoesPrice,shoesNum);
		System.out.printf("%s\t%s\t%d\n","T恤",shirtPrice,shirtNum);
		System.out.printf("%s\t%s\t%d\n","足球",footBallPrice,footBallNum);
		System.out.println("--------------------");
		System.out.printf("总价\t\t%.2f\n",sum);
		System.out.println("欢迎再次光临！");		
	}
}
