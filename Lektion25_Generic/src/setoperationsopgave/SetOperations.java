package setoperationsopgave;

import java.util.HashSet;
import java.util.Set;

public class SetOperations {

	public static <T> Set<T> union(Set<T> s1, Set<T> s2) {
		Set<T> set1 = new HashSet<>();
		set1.addAll(s1);
		set1.addAll(s2);
		return set1;
	}

	public static <T> Set<T> differens(Set<T> s1, Set<T> s2) {
		Set<T> set1 = new HashSet<>();
		for (T type : s1){
			if (!s2.contains(type)){
				set1.add(type);
			}
		}
		return set1;
	}

	public static <T> Set<T> intesection(Set<T> s1, Set<T> s2) {
		Set<T> set1 = new HashSet<>();
		for (T type : s1){
			if (s2.contains(type)){
				set1.add(type);
			}
		}
		return set1;
	}

}
