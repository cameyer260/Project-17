import java.util.*;

public class Driver {
	
	private static int dummyHashCode(int SSN) {
		return SSN % 1000;	
	}

	public static void main(String[] args) {
		TreeMap<Integer, String> myTM = new TreeMap<>();
		HashMap<Integer, Double> myHM = new HashMap<>();
		TreeSet<Double> myTS = new TreeSet<>();
		
		//tree map
		myTM.put(10035, "Jack");
		myTM.put(57832, "Ethan");
		myTM.put(43502, "Dumblewood");
		myTM.put(57932, "Guildenstern");
		myTM.put(30092, "James");
		myTM.put(25337, "Hunkleberry");
		myTM.put(39274, "Dumbleweed");
		myTM.put(40924, "Grogu");
		myTM.put(97736, "Crobb");
		myTM.put(00372, "Djarin");
		
		//hash map
		myHM.put(dummyHashCode(100203000), 3.7);
		myHM.put(dummyHashCode(387429797), 8.3); 
		myHM.put(dummyHashCode(431584000), 5.6);
		myHM.put(dummyHashCode(417928342), 5.4);
		myHM.put(dummyHashCode(131285972), 6.2);
		myHM.put(dummyHashCode(052323200), 3.4);
		myHM.put(521242420, 6.7);
		myHM.put(527891000, 5.9);
		myHM.put(830807247, 6.5);
		myHM.put(907239057, 8.6);
		
		//tree set
		myTS.add(4.2);
		myTS.add(2.7);
		myTS.add(1.3);
		myTS.add(3.5);
		myTS.add(1.2);
		myTS.add(2.8);
		myTS.add(3.4);
		myTS.add(2.4);
		myTS.add(1.1);
		myTS.add(0.5);
	}

}
