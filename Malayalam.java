package kk;
import java.util.Scanner;
public class Malayalam {

	public static void main(String[] args) {
		String s;
		int i,j;
		Scanner in=new Scanner(System.in);
		s=in.nextLine();
		char a[];
		a=s.toCharArray();
		for(i=0;i<a.length;i++){
			for(j=0;j<i;j++){
				if(a[i]==a[j]){
					break;
				}
				if(i==j){
					System.out.println("String : "+a[i]);
				}
			}
		}
	
	}
}
