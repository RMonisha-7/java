int num=input1;
int b=num;
int c;
int sum=0;
int p=1;
int len=Integer.toString(num).length();
for(int i=0;i<len;i++){
c=b%10;
b=b/10;
sum=sum+p;
p++;
}
