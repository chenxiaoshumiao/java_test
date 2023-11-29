package experiment3;
import java.util.Scanner;
public class CardIDDome {
			public static void main(String[] args) {
		            Scanner sc=new Scanner(System.in);
		            CardID id=new CardID();
		            String str;
		            while(true) {
		System.out.println("请输入18位身份证码:>");
	    str=sc.nextLine();
	    id.setCardNum(str);
	   if(str.equals("0")) break;
	if(!id.lenthVerify()) {
	    System.out.println("身份证号码长度有误。");
	    continue;
	}
	if(!id.charVerify()) {
	    System.out.println( "身份证号码字符有误。");
	    continue;
	}
	if(!id.placeVerify()){
	    continue;
	}
	if (!id.checkcodeVerify()) {
	    System.out.println("身份证号码最后一位校验码有误。");
	    continue;
	}
	System.out.println("身份证号码正确！");
	id.output1();
	// break;
	        }
	    }
	}


