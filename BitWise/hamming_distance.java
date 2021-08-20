class c{
public static void main(String [] args){
int A=23,count=0,B=5;
int xor=A^B;
while(xor!=0){
if(xor&1==1){
count++;
}
xor=xor>>1;  
}
System.out.println(count);
}
}
