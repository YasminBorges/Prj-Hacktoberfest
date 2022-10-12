import java.util.*;
public class Main
{
    public static double binaryToDecimal(int x){
        int num1=0;
        double num2=0;
        
        int i=0;
        while(x!=0){
            num1=x%10;
            x=x/10;
            num2=num2+((Math.pow(2,i))*num1);
            i++;
        }
        return num2;
    }
	public static void main(String[] args) {
      int x=101;
      Main obj=new Main();
      double number=obj.binaryToDecimal(x);
      int number1=(int)Math.round(number);
      System.out.print(number1);
	}
}


