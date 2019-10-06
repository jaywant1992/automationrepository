package Functions;

public class AccessModifier 
{
	public static void main(String[] args) {
		AccessModifier obj = new AccessModifier();
		
		obj.privatefunction();
		obj.protectedfunction();
		obj.publicfunction();
		obj.noAccessModifier();
	}
	public void publicfunction()
	{
		System.out.println("Public function");
	}

	private void privatefunction()
	{
		System.out.println("private function");
	}
	
	protected void protectedfunction()
	{
		System.out.println("protected function");
	}
	
	 void noAccessModifier()
	{
		 System.out.println("No access modifier function");
	}
}
