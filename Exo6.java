package TpNumber0;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;
public class Exo6 {
	
	

	public static void main(String[] args) {
		int lecture;
		ArrayList<Integer> collectionSaisie = new ArrayList<Integer>() ;
		int compteur = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Saisie Integer : ");
		lecture = sc.nextInt();
		while (lecture != 0) {
			System.out.println("Saisie integer : ");
			lecture = sc.nextInt();	
			collectionSaisie.add(lecture) ;
			compteur++;	
			
		}
		int somme = 0;
		System.out.println("Serie Saisie est :");
		System.out.println(collectionSaisie);
		
		Object[] obj = collectionSaisie.toArray();
		int[] table = new int[obj.length];
		
		for(int i = 0; i < table.length; i++) {
			table[i] = (int) obj[i];
		}
		
		for (int i = 0; i < table.length; i++) {
			System.out.print(table[i] + " ");
			somme += table[i];
		}
		System.out.println();
		double moyenne = (double) somme / table.length;
		
		DecimalFormat fm = new DecimalFormat();
		fm.setMaximumFractionDigits(2);
		System.out.println("La somme Serie Saisie : " + somme + "\nMoyenne : " + fm.format(moyenne));
		
		

	}

}
