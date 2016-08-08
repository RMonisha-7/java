package Num;

public class PascalTriangle {

	public static void main(String[] args){
		 int r, num;
		   int Rows=5;
		    
			for (int i = 0; i <=Rows; i++) {
		        num = 1;
		        r = i + 1;
		        for (int col = 0; col <= i; col++) {
		            if (col > 0) {
		                num = num * (r - col) / col;    
		            }
		            System.out.print(num + " ");
		        }
		        System.out.println();
		    }
		}
	}

