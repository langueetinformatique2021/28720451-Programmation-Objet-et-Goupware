package tp04;

public class BoucleConditionnelle {

	public static void main(String[] args) {
		String s1 = "azerty", s2 = "ytreza";
		boolean flag = false;
		int i = 0, n = s1.length();
		var strlen = (s1.length() == s2.length());
		
		
		do {System.out.println(flag);
			if (s1.charAt(i) != s2.charAt(n - i - 1))
					break;
				i++;
			if (i == n)
				flag = true; }
		while (i < n);
	}
}