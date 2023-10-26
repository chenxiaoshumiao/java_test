package Experriment_2;

import com.sun.xml.internal.fastinfoset.algorithm.HexadecimalEncodingAlgorithm;

import java.text.DecimalFormat;

public class Complex {
    private double realPart;
    private double imaginPart;
    public Complex(){}
    public Complex(double r,double i){
        realPart=r;
        imaginPart=i;
    }
    public String toString(){
        DecimalFormat df=new DecimalFormat("#.##");
        String rp = df.format(this.realPart);
        String ip = df.format(this.imaginPart);
        String result="";
        if(this.realPart!=0){//3+2i，3-2i，4+i，4-i，1
            if(this.imaginPart==0){//1
                result=rp;
            }else if(this.imaginPart==1){//4+i
                result=rp+"i";
            }else if(this.imaginPart==-1){//4-i
                result=rp+"-i";
            }else if(this.imaginPart>0){//3+2i 3-2i
                result=rp+"+"+ip+"i";
            }else {
                result=rp+ip+"i";
            }
        } else{//0，-2i，i，-i
            if(this.imaginPart==0){//0
                result="0";
            }else if(this.imaginPart==1){//i
                result="i";
            }else if(this.imaginPart==-1){//-i
                result="-i";
            }else {//-2i
                result=ip+"i";
            }
        }
        return result;
    }

}
