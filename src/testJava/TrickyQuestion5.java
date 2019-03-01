package testJava;

interface IFruit{
	public String TYPE="Apple";
}
class Fruit implements IFruit{
	
}
public class TrickyQuestion5 {
	public static void main(String args[]) {
		System.out.println(Fruit.TYPE);
	}
}
