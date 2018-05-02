import java.io.*;
import java.util.*;
import java.lang.*;
class ProblemA{
    public static void main(String []args){
	try{
	Scanner sc = new Scanner(System.in);
	String test = sc.nextLine();
	while(sc.hasNextLine()){
	    String s = sc.nextLine();
	    String[] array = s.split(" ");
	    if(check(array) == true){
		System.out.println(array[0] + " " + array[1] + " " + array[2] + " " + "Seems OK");
	    }
	    else{
		System.out.println(array[0] + " " + array[1] + " " + array[2] + " " + "Check");
	    }
	}
	}
	catch(Exception e){
	    System.out.println("you fucked up");
	}
    }
    public static Boolean check(String[] array){
	if(Integer.parseInt(array[0]) + Integer.parseInt(array[1]) + Integer.parseInt(array[2]) == 180){
	    return true;
	}
	return false;
    }
}
