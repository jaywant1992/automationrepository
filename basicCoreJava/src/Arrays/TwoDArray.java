
package Arrays;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[][] data = new String[5][2];
		
		//Row 1
		data[0][0] = "Username0";
		data[0][1] = "Password0";
		
		//Row 2
				data[1][0] = "Username1";
				data[1][1] = "Password1";
				
				//Row 3
				data[2][0] = "Username2";
				data[2][1] = "Password2";
				
				//Row 4
				data[3][0] = "Username3";
				data[3][1] = "Password3";
				
				//Row 5
				data[4][0] = "Username4";
				data[4][1] = "Password4";
		
				for(int r=0; r<data.length; r++)
				{
					for(int c=0; c<data[r].length; c++)
				
				{
				System.out.println(data[r][c]);
	
				}
				}
	}
}
	


