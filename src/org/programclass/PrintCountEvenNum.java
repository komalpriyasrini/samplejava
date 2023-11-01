package org.programclass;
import java.util.Iterator;
public class PrintCountEvenNum {
public static void main(String[] args) {
	int count = 0;
	for (int i =1; i<=100;i++) {
	if (i%2==0)
	count++;
	}
	System.out.println("EvenNumber Count:"+count);
	
}
}
