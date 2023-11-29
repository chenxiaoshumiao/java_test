package experiment3;
import java.util.Calendar;
	public class CardID {
		private String cardNum;
	    public void setCardNum(String cardNum){//换一个号码
    this.cardNum=cardNum;
}
public boolean lenthVerify(){//位数验证错误
    return this.cardNum.length()==18;
}
public boolean charVerify(){//字符验证错误
boolean flag=true;
//取出前17位做对比，再取出最后以为对比
for(int i=0;i<17;i++){
    int c=this.cardNum.charAt(i);
    if(c<'0'||c>'9') {
        flag=false;
        break;
    }
}
char last=this.cardNum.charAt(17);
if (!((last>='0'&&last<='9')||last=='x'||last=='X')){
        flag=false;
    }
    return flag;
}
private int cityCode;
private int districtCode;
private static final int[] districtNum = {0,17, 8, 23, 5, 
		15, 17, 15, 8, 10, 12, 13, 14, 12, 11, 16, 18, 9, 13};
// 其他属性和方法
public boolean placeVerify() {
   int[] county={0, 17, 8, 23, 5, 15, 17, 15, 8, 10, 12,
		   13, 14, 12, 11, 16, 18, 9, 13};
   boolean c1=true,c2=true;
   int cityNum=Integer.parseInt(this.cardNum.substring(2,4));

   int areaNum=Integer.parseInt(this.cardNum.substring(4,6));
   if(cityNum<1||cityNum>18)c1=false;
   if(areaNum<1||areaNum>30)c2=false;
   if (c1==true&&(areaNum > county[cityNum])) {
       c2 = false;
   }
   if(!c1&&!c2) {
       System.out.println("城市区县编码都错误，字符正确");
       return false;
   }
    if(!c1) {
        System.out.println("城市编码错误，字符正确");
        return false;
    }
   if(!c2) {
       System.out.println("区县编码错误，字符正确");
       return false;
   }
   return true;
}
public boolean checkcodeVerify(){//效验码错误验证
//测试时将每一轮的i，di，wi，sum输出，成功后不再输出
String testNum=this.cardNum.substring(0,17)+"0";
    int i=18,ai,wi,sum=0,mod;
    for(i=18;i>0;i--){
        ai=testNum.charAt(18-i)-48;
        wi= (int) Math.pow(2,i-1)%11;
        sum+=((ai*wi)%11);
   //System.out.println("i="+i + "ai="+ ai+ "wi="+ wi+ "sum=" + sum);
}
mod =sum %11;
char[]last={'1','0','X','9','8','7','6','5','4','3','2'};
System.out.println("正确的效验码是"+last[mod]);
    return this.cardNum.toUpperCase().charAt(17)==last[mod];
}
public String toString(){
    return  this.cardNum;
}
public void output1(){//个人信息输出
int birthYear,birthMonth,birthDay;
birthYear=Integer.parseInt(this.cardNum.substring(6,10));
birthMonth=Integer.parseInt(this.cardNum.substring(10,12));
birthDay=Integer.parseInt(this.cardNum.substring(12,14));
System.out.println("您的生日是:"+birthYear+"年"+birthMonth+"月"+birthDay+"日");
Calendar cal=Calendar.getInstance();
int curYear=cal.get(Calendar.YEAR);
int curMonth=cal.get(Calendar.MONTH)+1;//0-11
int curDay=cal.get(Calendar.DAY_OF_MONTH);
int age=curYear-birthYear;
if(curMonth<birthMonth)age--;//月没有到
if (curDay<birthDay&&curMonth==birthMonth)age--;//月到了日没到
if(curDay==birthDay&&curMonth==birthMonth)
System.out.println("今天是您的生日，生日快乐！");
System.out.println("当前日期是："+curYear+"年"+curMonth+"月"+curDay+"日");
System.out.println("您的年龄是："+age);
if(this.cardNum.charAt(16)%2==0) System.out.println("女性"+" "+age);
else System.out.println("男性"+" "+age);
	}
}
