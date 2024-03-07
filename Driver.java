package trees;

import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Driver {
	
	private static int hashCode(int SSN) {
		return SSN % 1000;	
	}

	public static void main(String[] args) throws FileNotFoundException {
		TreeMap<Integer, String> myTM = new TreeMap<>();
		HashMap<Integer, Double> myHM = new HashMap<>();
		TreeSet<Double> myTS = new TreeSet<>();
		
		Scanner sc = new Scanner(new File("file.txt")); //java scanner setup
		
		String next;
		int i =0; //i=0 line 1 (TreeMap), i=1 line 2 (HashMap), i=2 line 3 (TreeSet)
		while(sc.hasNext()) {
			next = sc.next();
			if(next.equals("STOP")) {
				i++;
				try {
					next = sc.next();
				} catch(NoSuchElementException e) {
					i=-1;
				}
			}
			
			if(i==0) { //TreeMap
				myTM.put(Integer.parseInt(next), sc.next());
			} else if(i==1) { //HashMap
				myHM.put(Integer.parseInt(next), Double.parseDouble(sc.next()));
			} else if(i==2){ //TreeSet
				myTS.add(Double.parseDouble(next));
			}
		}
		
		//to strings
		System.out.println("TreeMap toString() output: " + myTM.toString());
		System.out.println("HashMap toString() output: " + myHM.toString());
		System.out.println("TreeSet toString() output: " + myTS.toString());
	}

}
