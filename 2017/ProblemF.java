import java.io.*;
import java.util.*;
import java.lang.*;
class ProblemF{
    public static ArrayList<String> removed = new ArrayList<String>();
    public static void main(String[] args){
	//File file = new File("test.txt");
	try{
	    Scanner sc = new Scanner(System.in);
	    //Numbers of players
	    int numPlayers = Integer.parseInt(sc.nextLine());
	    String[] names = new String[numPlayers];
	    //Save players name to String array
	    for(int i = 0; i <numPlayers; i++){
		names[i] = sc.nextLine();
	    }
	    ArrayList<String> original = new ArrayList<String>(Arrays.asList(names));
	    int rounds = Integer.parseInt(sc.nextLine());
	    for(int i = 0; i<rounds; i++){
		String s = sc.nextLine();
		String[] set = s.split(" ");
		int seat_removed = Integer.parseInt(set[0]);
		int shuffle = Integer.parseInt(set[1]);
		names = shuffle(names, shuffle);
		String[] tmp = remove(names, seat_removed);
		names = new String[names.length-1];
		names = tmp;
	    }
	    if(names.length!=1){
		names = reorder(original, names);
		System.out.print("Players left are");
	        for(int i = 0; i < names.length; i++){
		    System.out.print(" "+names[i]);
		}
		System.out.print(".");
		System.out.println();
	    }
	    else{
		System.out.println(names[0] + " has won.");
	    }
	}
	catch(Exception e){
	    e.printStackTrace();
	}
    }
    public static String[] shuffle(String[] array, int num){
	//How many shuffles to make
	num = num % array.length;
	String[] newArray = new String[array.length];
	for(int i = 0; i<array.length; i++){
	    int newP = i + num;
	    if(newP>=array.length){ newP-=array.length;}
	    newArray[newP] = array[i];
	}
	return newArray;
    }
    public static String[] remove(String[] array, int index){
	ArrayList<String> al = new ArrayList<String>(Arrays.asList(array));
	System.out.println(al.get(index-1) + " has been eliminated.");
	removed.add(al.get(index-1));
	al.remove(index-1);
	//System.out.println(al);
	String[] newArray = al.toArray(new String[al.size()]);
	return newArray;
    }
    public static String[] reorder(ArrayList<String> al, String[] array){
	for(int i=0; i<removed.size(); i++){
	    al.remove(removed.get(i));
	}
	String[] newArray = al.toArray(new String[al.size()]);
	return newArray;
    }
}
 
