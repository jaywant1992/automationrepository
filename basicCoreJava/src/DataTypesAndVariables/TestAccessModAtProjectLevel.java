package DataTypesAndVariables;

import Functions.AccessModifier;

public class TestAccessModAtProjectLevel extends AccessModifier{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AccessModifier obj = new AccessModifier();
		
		obj.publicfunction();
		
		TestAccessModAtProjectLevel obj2 = new TestAccessModAtProjectLevel();
		obj2.protectedfunction();
		
	}

}
