import java.io.*;
import java.util.*;
import java.lang.*;

class ProblemG{
    public static void main(String[] args){
	try{
	    int[] counts = new int[26];
	    for(int i =0; i<counts.length; i++){
		counts[i] = 0;
	    }
	    Scanner sc = new Scanner(System.in);
	    String s = sc.nextLine();
	    char[] array = s.toCharArray();
	    //System.out.println("Initial Setup success");
	    for(int i =0; i<array.length; i++){
		// If are Capital letters, do thing
		if(array[i]>=65&&array[i]<=90){
		    int num = counts[(int)array[i]-65] + 1;
		    counts[(int)array[i]-65] = num;
		    //System.out.print(counts[i]);
		}
		// lowercase
		if(array[i]>=97&&array[i]<=122){
		    int num = counts[(int)array[i]-97] + 1;
		    counts[(int)array[i]-97] = num;
		    //System.out.print(counts[i]);
		}
	    }
	    for(int i = 0; i< counts.length; i++){
		Character a = 'A';
		System.out.print((char)(a+i) + " | ");
		for(int j =0; j<counts[i]; j++){
		    System.out.print("*");
		}
		System.out.println();
	    }
	}
	catch(Exception e){
	    e.printStackTrace();
	}
    }
}
