/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package montecarlointegration;

/**
 *
 * @author OZLEM
 */
public class MonteCarloIntegration {

    /**
     * @param args the command line arguments
     */
    public static double f1(double x){
        
        return x;
         }
    public static double f2(double x){
        return (x-1)/(x*x);
    }
   public static double MonteCarloIntegration(double a, double b, long iterations){
       
       if(a>b){
           
           return MonteCarloIntegration(b,a,iterations);
}

double sum1 =0,sum2=0,r1=0,r2=0;
for( long i=1;i<=iterations; i++){
          r1= Math.random();
           r2= Math.random();
          
          sum1= sum1+f1(a+((b-a)*r1));
          sum2=sum2+f2(a+((b-a)*r2));
}
sum1 =((b-a)/iterations)*sum1;
sum2 =((b-a)/iterations)*sum2;

return sum1-sum2;
}
          
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Estimation is "  +  MonteCarloIntegration(1,2,1000000));
        
    }
    
}
