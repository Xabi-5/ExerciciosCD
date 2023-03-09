public class Factores {
    public static void main(String args[]) {
        int n=98;
        System.out.print(n + "=");
            for (int i=2; i<n;i++)
            {
                while (n%i==0){
                    n=n/i;
                    if(n!=1){
                        System.out.print(i+" x ");
                        
                    }else{
                        System.out.print(i);
                    }
                    
                    
                }
            }
            if(n!=1){
                System.out.print(n);
            }
        }
   } 