class HelloWorld {
   static void  binary(int n){
        if(n>1){
            binary(n>>1);
        }
        System.out.print(n&1);
    }
    public static void main(String[] args) {
        System.out.println("Hello, World!"); 
        int x=5;
        binary(x); //101
        
    }
}
