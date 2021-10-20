package tp02;

/*
 * 
 *@author Asmae
 *
 *
 *la methode divise returne la valeur n/2 si un entier est divisible par 13 
 *sinon elle retourne la valeur n+2.
 */


public class B {
	/*
	 * @param n
	 * @return n/2 sinon n+2
	 */
	public static int divise(int n) {
		if (A.treize(n) == true)
			return n / 2;
		else
			return n + 2;

	}
}
