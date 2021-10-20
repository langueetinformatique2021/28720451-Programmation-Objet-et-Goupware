package tp02;
/*
 * @author 28720451
 */

public class testAB {
	public static void main(String[] args) {
		/*
		 * création de la variable i a qui on donne la valeur 1
		 * et la variable m qui désigne le nombre de fois que la methode divise s'execute
		 */
		int i=1;
		int m=10;
		
		/*
		 * la variable i se renouvelle à chaque itération en prenant la valeur précédante.
		 * 
		 */
	for (i=1, m=0; m<=10; m++) {
		 i=B.divise(i);
		System.out.println(B.divise(i));
	}
	}
}
