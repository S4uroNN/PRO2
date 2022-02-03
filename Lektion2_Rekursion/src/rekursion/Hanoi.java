/*
 * 
 */
package rekursion;

/**
 * @author mad
 */
public class Hanoi {

	public static void flyt(int n, int fra, int til){
		int antal = 0;
		if (n==1) {
			System.out.println("Flyt fra " +fra +" til " + til);

		}
		else {
			int temp = 6 - fra - til;
			flyt(n-1,fra,temp);
			System.out.println("Flyt fra " + fra +" til " + til);
			flyt(n-1,temp,til);
		}

	}
	public static int findFlytninger(int n){
		int result = 0;
		if (n == 1){
			result = 1;
		}
		else {
			result = 2 * findFlytninger(n-1) + 1;
		}
		return result;
	}
	public static void main(String[] args) {
			flyt(5,1,3);
		System.out.println(findFlytninger(56));
	}
	//
}
