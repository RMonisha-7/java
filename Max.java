package kk;

public class Max {

	public static void main(String[] args) {
	int a[]={25,76};
	int max=0;
	for(int i=0;i<a.length;i++){
		if(a[i]>max){
			max=a[i];
		}
	}
	System.out.println("MAX : "+max);
	}

}
