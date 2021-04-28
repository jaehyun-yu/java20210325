package p13.textbook.exericses.ex04;

import p13.textbook.exericses.ex04.Pair;

public class Util {

	public static <K, V> V getValue(Pair<K, V> pair, K string) {
		K key = pair.getKey();
		
		if (key.equals(string)) {
			return pair.getValue();
		}
		 
		return null;
	}
	
}
