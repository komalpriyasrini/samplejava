package org.programclass;
import java.util.Iterator;

public class ReverseNumber {
public static void main(String[] args) {
	int num=1234; int rev=0;
	System.out.println("Input Value:"+num);
	while (num>0) {
		int temp = num%10;
		rev=(rev*10)+temp;
        num=num/10;

	}
			System.out.println("Reverse value:"+rev);
		
}
}

