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
		
		//array lists for treemap, hashmap, and treeset
		ArrayList<Integer> tmKeys = new ArrayList<>();
		ArrayList<String> tmValues = new ArrayList<>();
		ArrayList<Integer> hmKeys = new ArrayList<>();
		ArrayList<Double> hmValues = new ArrayList<>();
		ArrayList<Double> tsValues = new ArrayList<>();
		String s;
		boolean stop = false;
		
		//filling array lists
		//tree map keys
		while(sc.hasNextInt()) {
			tmKeys.add(sc.nextInt());
		}
		sc.nextLine();
		//tree map values
		while(sc.hasNext() && !stop) {
			s = sc.next();
			if(s.equals("STOP")) {
				stop = true;
			} else {
				tmValues.add(s);
			}
		}
		sc.nextLine();
		sc.nextLine();
		//hash map keys
		while(sc.hasNextInt()) {
			hmKeys.add(sc.nextInt());
		}
		sc.nextLine();
		//hash map values
		stop = false;
		while(sc.hasNextDouble() && !stop) {
			s = sc.next();
			if(s.equals("STOP")) {
				stop = true;
			} else {
				hmValues.add(Double.parseDouble(s));
			}
		}
		sc.nextLine();
		sc.nextLine();
		while(sc.hasNextDouble()) {
			tsValues.add(sc.nextDouble());
		}
		
		for(int i = 0; i<10; i++) {
			myTM.put(tmKeys.get(i), tmValues.get(i));
			myHM.put(hashCode(hmKeys.get(i)), hmValues.get(i));
			myTS.add(tsValues.get(i));
		}
		
		//to strings
		System.out.println("TreeMap toString() output: " + myTM.toString());
		System.out.println("HashMap toString() output: " + myHM.toString());
		System.out.println("TreeSet toString() output: " + myTS.toString());
	}

}
