
import java.io.*;
import java.util.StringTokenizer;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		
		ArrayList<Integer> lst = new ArrayList<>();

		// add elements
		lst.add(1);
		lst.add(2);
		lst.add(3);

		// print arraylist
		System.out.println(lst);

		// access any element
		int ele = lst.get(0); // lst.get(index);

		// remove element
		lst.remove(0); // lst.remove(index);

		// size / length 
		int n = lst.size();

		for(int i = 0; i < n; i++){
			System.out.println(lst.get(i));
		}

		// alter list
		lst.set(0, 2); // lst.set(index, element);

		// sort inplace
		Collections.sort(lst);

		// max element
		int maxm = Collections.max(lst);

		// min element
		int minm = Collections.min(lst);

		// reverse 
		Collections.reverse(lst);
	}
}
