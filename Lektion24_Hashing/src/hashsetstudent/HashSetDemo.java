package hashsetstudent;

/**
 * This program demonstrates the hash set class.
 */
public class HashSetDemo {
	public static void main(String[] args) {
//		HashSetChaining names = new HashSetChaining(13);
//		// HashSetLinearProbing names = new HashSetLinearProbing(13);
//
//		names.add("Harry");
//		names.add("Sue");
//		names.add("Nina");
//		names.add("Susannah");
//		names.add("Larry");
//		names.add("Eve");
//		names.add("Sarah");
//		names.add("Adam");
//		names.add("Tony");
//		names.add("Katherine");
//		names.add("Juliet");
//		names.add("Romeo");
//		names.rehash();
//		System.out.println(names.size());
//		System.out.println(names.contains("Romeo"));
//
//		names.remove("Romeo");
//		System.out.println(names.contains("Romeo"));
//		System.out.println(names.contains("George"));
//		names.remove("George");
//		names.writeOut();
//		System.out.println(names.size());
		// System.out.println();
		// names.writeOut();
		// System.out.println();

		HashSetLinearProbing hash = new HashSetLinearProbing(10);
		hash.add("99");
		hash.add("89");
		hash.add("79");
		hash.add("49");
		hash.add("6");
		hash.add("5");
		hash.add("9");
		System.out.println(hash.add("9"));
		hash.add("23");
		hash.add("532");
		hash.add("53");
		//hash.add("53");


		hash.writeOut();
		System.out.println(hash.remove("99"));
		System.out.println(hash.remove("89"));
		hash.writeOut();
	}
}
