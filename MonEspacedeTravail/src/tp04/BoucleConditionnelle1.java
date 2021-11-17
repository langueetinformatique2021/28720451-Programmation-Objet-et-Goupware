package tp04;

/** Exercice 1: boucle à posteriori 
 * permet de répéter un traitement à l'aide de do et while
 *  
 * @author Asmae
 *
 */
public class BoucleConditionnelle1 {

	public static void main(String[] args) {
		String s1 = "azerty", s2 = "ytreza";
		boolean flag = true;
		int i = 0, n = s1.length();
		var strlen = (s1.length() == s2.length());
		
		do {System.out.println(flag);
			if (s1.charAt(i) != s2.charAt(n - i - 1))
					break;
				i++;
			if (i == n)
				flag = false; }
		while (i < n);
	}
}