int a=0;
int sum=0;
int n1,n2,n;
n1=n%10;
int pow=(int) Math.pow(n1,a);
sum=sum+pow;
n=n%10;
while(n>0){
n2=n%10;
int pow=pow+(int)Math.pow(n2,n1);
n1=n2;
n=n/10;
}