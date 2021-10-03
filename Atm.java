package day4;
import java.util.*;
public class Atm {
	public static void main(String[] args) {
		  int password;
	         int i;
	        Scanner s= new Scanner(System.in);
	        for( i=1;i<=3;i++)
	        {
	        System.out.println("enter password");
	        password=s.nextInt();
	        if(password==2345)
	        {
	        System.out.println(" access allowed");
	        break;
	}
	        }
}
}