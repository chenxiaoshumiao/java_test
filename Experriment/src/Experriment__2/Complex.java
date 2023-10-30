package Experriment__2;

import com.sun.xml.internal.fastinfoset.algorithm.HexadecimalEncodingAlgorithm;

import java.text.DecimalFormat;

public class Complex {
    private double realPart;
    private double imaginPart;
    //构造方法
    public Complex(){}
    public Complex(double r,double i){

        realPart=r;
        imaginPart=i;
    }
    //加法的方法
    public Complex complexAdd(Complex a){//加法
        Complex result=new Complex();
        result.realPart=this.realPart+a.realPart;
        result.imaginPart=this.imaginPart+a.imaginPart;
        return result;
    }
    public Complex complexSub(Complex a){//减法
        Complex result=new Complex();
        result.realPart=this.realPart-a.realPart;
        result.imaginPart=this.imaginPart-a.imaginPart;
        return result;
    }
    public Complex complexMulti(Complex a){//复数相称
        Complex result=new Complex();
        result.realPart=this.realPart*a.realPart-this.imaginPart*a.imaginPart;//ac-bd
        result.imaginPart=this.imaginPart*a.realPart+this.realPart*a.imaginPart;//bc+ad
        return result;
    }
    public Complex conjugate(Complex a){//共轭复数
        Complex result=new Complex();
        result.realPart=a.realPart;
        result.imaginPart=-a.imaginPart;
        return result;
    }
    public Complex complexDiv(Complex a){
        Complex result=new Complex();
        Complex aConj=conjugate(a);//分母共轭复数
        Complex numerator=this.complexMulti(aConj);//分子乘共轭
        Complex denominator=a.complexMulti(aConj);//分母乘共轭
        result.realPart=numerator.realPart/denominator.realPart;
        result.imaginPart=numerator.imaginPart/denominator.realPart;
        return result;
    }
    public String toString(){
        DecimalFormat df=new DecimalFormat("#.##");
        String rp = df.format(this.realPart);//实数部分格式
        String ip = df.format(this.imaginPart);//虚数部分格式
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
