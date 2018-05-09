import java.util.ArrayList;

public class PascalTriangle {

	private static ArrayList<String> arr = new ArrayList<String>();
	
	public static ArrayList<String> getArr(){
		return arr;
	}
	
	public static void iterate(int n) {
		arr = new ArrayList<String>();
		String step = "";
		for (int i = 0; i < n; i++) {
			step+=new String(new char[(n-i)]).replace("\0", " ");
			for (int j = 0; j <= i; j++) {
				step+=pascal(i, j)+" ";
			}
			arr.add(step);
			step = "";
		}
	}

	public static int pascal(int i, int j) {
		//Write boundary conditions
		if(i == j || j == 0){
			return 1;
		}
		
		
		return pascal(i-1,j-1) + pascal(i-1,j); //Dummy Return
	}

	public static void main(String[] args) {
		//Used for visual aid
		iterate(6);
		for(String s: arr) {
			try {
				Thread.sleep(500);
				System.out.println(s);
			}catch (Exception e) {
				//DO Nothing
			}
		}
	}
}