package Experriment__2;

public class ComplexDemo {
 public static void main(String[] args) {

//
     Complex cArr[]={new Complex(3,2), new Complex(3,-2),
                     new Complex(4,1), new Complex(4,-1),
                     new Complex(1,0), new Complex(0,0),
                     new Complex(0,-2), new Complex(0,1),
                     new Complex(0,-1)};
     for(Complex c:cArr){
         System.out.println(c+",");
     }

     Complex c1=new Complex(1,2);
     Complex c2=new Complex(3,4);
     System.out.println("c1="+c1);
     System.out.println("c2="+c2);
     Complex c3=c1.complexAdd(c2);
     System.out.println("c1+c2="+c3);
     c3=c1.complexSub(c2);
     System.out.println("c1-c2="+c3);
     c3=c1.complexMulti(c2);
     System.out.println("c1*c2="+c3);
     c3=c1.complexDiv(c2);
     System.out.println("c1/c2="+c3);

    }

}
