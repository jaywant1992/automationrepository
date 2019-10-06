package Functions;

public class functions1 {

	public static void main(String[] args) {
		//TODO Auto-generated method stub
		int a=sum(10, 20); 
		int b=sum(30, 40); 
		System.out.println(a+b);
		
		NonStaticFunction obj= new NonStaticFunction();
		System.out.println(obj.sum(10, 20));
		
	}

	/*
	 * public static void sum(int a, int b) {
	 * 
	 * int sum=a+b; System.out.println(sum); }
	 */
	
	public static int sum(int a, int b)
	{
		
		int sum=a+b;
		return sum;
		//System.out.println(sum);
	}
}
