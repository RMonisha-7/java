package kk;

public class Reverse {

	public static void main(String[] args) {
		String str="hello world";
		int c1=0;
		String b[]=str.split(" ");
		int c=b.length;
		for(int i=0;i<c;i++){
			char a[]=b[i].toCharArray();
			c1=a.length;
			for(int j=c1-1;j>=0;j--){
				System.out.println(a[j]);
	
			}
			
		}
	}

}
