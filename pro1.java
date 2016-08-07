String str="Wipro Technologies";
int c1=0;
String b[]=str.split(" ");
int c=b.length;
for(int i=0;i<c;i++){
char a[]=b[i].toCharArray();
c1=a.length;
for(int j=c1-1;j>=0;j--){
System.out.print(a[j]);
}}