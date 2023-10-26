package Experriment_2;

public class ComplexDemo {
 public static void main(String[] args) {
     Complex c1=new Complex();
     Complex c2=new Complex(2,5);
     System.out.println(c1);
     System.out.println(c2);
     Complex cArr[]={new Complex(3,2), new Complex(3,-2),
                     new Complex(4,1), new Complex(4,-1),
                     new Complex(1,0), new Complex(0,0),
                     new Complex(0,-2), new Complex(0,1),
                     new Complex(0,-1)};
     for(Complex c:cArr){
         System.out.println(c+",");
     }

    }

}
