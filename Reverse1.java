package kk;

public class Reverse1 {

	public static void main(String[] args) {
	int n=123;
	int reverse=0;
	while(n>0){
	int	n1=n%10;
	reverse=reverse*10+n1;
	n=n/10;
	
		
	}
System.out.println(reverse);
	}

}
