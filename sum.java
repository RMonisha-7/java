public class Sumofpower {

	public static void main(String[] args) {
		int n=572;
		int sum=0;
		int count=0;
		int a=2;
		int input=n;
		while(n>0){
			n=n/10;
			count++;
		}
		while(input>0){
			int n1=input%10;
			int pow=(int)Math.pow(n1,a);
			sum=sum+pow;
			input=input/10;
			
		}
	}

}
