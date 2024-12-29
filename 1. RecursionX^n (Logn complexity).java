

class Main {
    public static void main(String[] args) {
       
       
       int x = 3, n = 3;
       
       System.out.print(xToThePowern (x, n));
       
    }
    
    public static int xToThePowern (int x, int n){
        
        if (n==0){
            return 1;
        }
        
        if (x%2 == 0){

            return xToThePowern(x, n/2) * xToThePowern(x, n/2);

        } else{

            return xToThePowern(x, n/2) * xToThePowern(x, n/2) * x;

        }
        
    }
}