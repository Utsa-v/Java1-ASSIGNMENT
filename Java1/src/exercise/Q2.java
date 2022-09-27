package exercise;

import java.util.*;
public class Q2 {	
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st;
		String re = " ";
		do {
			st=sc.next();
			re=re+" "+st;
		}while(!st.equals("XDONE"));
		System.out.println(re);
	}
}