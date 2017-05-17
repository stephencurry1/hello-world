package demo1;
/**
 * 
 * 类描述：无名的粉
 * @filename：UnknowPower.java
 */
public class UnknowPowder implements Showable{
	//味道
	private String taste;
	//粉的分量
	private int quantity;
	//是否带汤
	private boolean likeSoup;
	
	//无参构造函数
	public UnknowPowder() {
		System.out.println("我是无参构造函数！");
	}
	
	//带2个参数的构造函数
	public UnknowPowder(String taste,int quantity) {
		this.taste = taste;
		this.quantity = quantity;
	}
	
	//带3个参数的构造函数
	public UnknowPowder(String taste,int quantity,boolean likeSoup) {
		this.taste = taste;
		this.quantity = quantity;
		this.likeSoup = likeSoup;
	}
	
	@Override
	public void show() {
		System.out.println("味道：" + taste + "\n" + "粉的分量：" + quantity + "两" + "\n" + "是否带汤：" + likeSoup);
	}
	
}



















