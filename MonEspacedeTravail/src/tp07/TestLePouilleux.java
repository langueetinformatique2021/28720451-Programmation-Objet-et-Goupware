package tp07;

import java.util.random.*;
/** Le jeu consiste à poser des paires et se débarasser des cartes, le joeur qui possède
 * le valet de pique perd!
 */

public class TestLePouilleux {

	public static void main(String[] args) {
		cartedebut = new carte(2);
		cartefin  = new carte(2);
		int i = 0;
		boolean ValetDePique;
		try {
			while (true) {
				
				if( ValetDePique == true)
				System.out.println("Le joueur qui possède le valet de pique perd !");
				i++;}
		}
		
		catch (LePouilleux b) {
			System.out.println("Perdu ! en "+i+" essais");}
	}
		public static void poserCoupleCartes(cartedebut c1, cartefin c2) throws LePouilleux {
			int cartedebut = c1.poser();
			int cartefin = c2.poser();
			if (cartefin-cartedebut==0)
				throw new LePouilleux("Le gagnant est celui qui n'a plus de cartes");}
}

	
			
