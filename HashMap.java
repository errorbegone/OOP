import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args){

		HashMap<Integer, Integer> map = new HashMap<>();

		// check if contains key
		boolean contain = map.containsKey(2);

		// add a key
		if(!map.containsKey(2)){
			map.put(2, 1);
		}
		// map => {2: 1}

		// access a value
		int value = map.get(2); // key = 2
		
		// update a key
		map.put(2, map.get(2) + 1);
		// map => {2: 2}

		// get max key
		int maxm_key = Collections.max(map.keySet());

		// get max value
		int maxm_value = Collections.max(map.values());

		// remove a key
		map.remove(2);

		// length
		map.size();

		// Some Variants
		HashMap<Integer, ArrayList<>()> hm = new HashMap<>();
		HashMap<String, ArrayList<>()> hm = new HashMap<>();
		

	}
}
