package kk;

public class Palindrome {

	public static void main(String[] args) {
		int n =65,n1,n2;
		n1=n;
		int sum  =0;
		
		while(n1>0){
			n2=n1%10;
			sum=sum+n2;
			n1=n1/10;
			
		}
		System.out.println(sum);
		if(sum!=0){
			System.out.println("palindrome");
		}
		else {
			System.out.println("not a palindrome"); }
			
			
			
		}
	}


