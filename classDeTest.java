package MergeSort;

public class classDeTest {	
	
	public final class Chaine implements Comparable{
		private char rep[];
		private int longueur;	
		
		public Chaine() {
			rep = new char[0];
			longueur = 0;
		}
		
		public Chaine(Chaine original) {
			this.rep = original.rep;
			this.longueur = original.longueur;
		}
		
		public Chaine(char tab[]) {
			this.longueur = tab.length;
			this.rep = (char[])tab.clone();
		}
		
		public int length() {
			return longueur;
		}
		
		public char charAt(int index) {
			if (index < 0 || (index >= longueur))
				throw new ChaineIndexOutOfBoundsException(index);
			return rep[index];
		}
		
		public void getChars(int srcDeb, int srcFin, char dst[], int dstDeb) {
			if(srcDeb < 0) throw new ChaineIndexOutOfBoundsException(srcDeb);
			if(srcFin < longueur) throw new ChaineIndexOutOfBoundsException(srcFin);
			if(srcDeb > srcFin) throw new ChaineIndexOutOfBoundsException(srcFin - srcDeb);
			System.arraycopy(rep, srcDeb, dst, dstDeb, srcFin - dstDeb);
		}
		
		public Chaine(char tab[], int deb, int l) {
			if(deb < 0) throw new ChaineIndexOutOfBoundsException(deb);
			if(l < 0) throw new ChaineIndexOutOfBoundsException(l);
			if(deb > tab.length) throw new ChaineIndexOutOfBoundsException(deb + 1);
			this.longueur = l;
			this.rep = new char[l];
			System.arraycopy(tab, deb, this.rep, 0, l);
		}
		
		public char[] toCharArray() {
			char resultat[] = new char[longueur];
			for (int i = 0; i < longueur; i++) {
				resultat[i] = rep[i];
			}
			return resultat;
		}
		
		public boolean equals(Object unObjet) {
			if(this == unObjet) return true;
			if(unObjet instanceof Chaine) {
				Chaine c = (Chaine)unObjet;
				if(longueur == c.longueur) {
					for(int i = 0; i < longueur; i++) {
						if (rep[i] != c.rep[i]) return false;
					}
					return true; 				
				}
			}
			return false;
		}
		
		public int compareTo(Chaine uneChaine) {
			int l1 = longueur;
			int l2 = uneChaine.longueur;
			int n = l1 < l2 ? l1 : l2;
			for(int i = 0; i < n ; i++) {
				if (rep[i] != uneChaine.rep[i]) return rep[i] - uneChaine.rep[i];
			}
			return l1 - l2;
		}
		
		public int compareTo(Object o) {
			return compareTo((Chaine)o);
		}
		
		public boolean startWith(Chaine p) {
			if(p.longueur > longueur) return false;
			for(int i = 0; i < p.longueur; i++) {
				if (rep[i] != p.rep[i]) return false;
			}
			return true;
		}
		
		public boolean endWith(Chaine s) {
			if(s.longueur > longueur) return false;
			for(int i = s.longueur - 1, j = longueur - 1; i>=0; --i, --j) {
				if(rep[i] != s.rep[j]) return false;
			}
			return true;
		}
		
		public int indexOf(int ch) {
			return indexOf(ch, 0);
		}
		
		public int indexOf(int ch, int deb) {
			if (deb < 0) deb = 0;
			else if (deb >= longueur) return -1;
			for(int i = deb; i < longueur; i++)
				if (rep[i] == ch) return i;
			return -1;
		}
		
		public int lastIndexOf(int ch, int deb) {
			for(int i = (deb >= longueur) ? longueur - 1 : deb; i >=0; i--)
				if (rep[i] == ch) return i;
			return -1;
		}
		
		public int lastIndexOf(int ch) {
			return lastIndexOf(ch, longueur - 1);
		}
		
		
		
		public class ChaineIndexOutOfBoundsException extends RuntimeException {
			public ChaineIndexOutOfBoundsException(int ou) {
				super("ChaineIndexOutOfBoundsException en " + String.valueOf(ou));
			}
		}
	}
	
	

	
	
	public static void main(String[] args) {
		  
		    
		   
	}
 }
