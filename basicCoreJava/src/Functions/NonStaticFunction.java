package Functions;

public class NonStaticFunction {

	public static void main(String[] args) {
		
		NonStaticFunction obj=new NonStaticFunction();
		int add=obj.sum(10, 20);
		System.out.println(add);
		
		functions1.sum(10, 20);
	}
	
	public int sum(int a, int b)
	{
		return a+b;
	}
}
