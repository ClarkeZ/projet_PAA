import java.util.Scanner;

public class UtilMain {
	public static void main(String [] Args) {
		Scanner sc = new Scanner(System.in);
		int nbVille=27;
		while((nbVille>26)) {
			System.out.println("Entrez le nombre de villes (<=26)");
			nbVille=sc.nextInt();	
		}		
		System.out.println("Nombre de villes = "+nbVille);
		//Impl�menter le for incrementant les villes lettre par lettre
		menuRoute();
		menuEcole();
	}
	
	public static void menuRoute(){
		Scanner sc= new Scanner(System.in);
		boolean sortie= false;
		int choix;
		while(!sortie) {
			System.out.println("Que voulez-vous faire ?");
			System.out.println("1) Ajouter une route");
			System.out.println("2) Fin");
			choix=sc.nextInt();
			switch(choix) {
			case 1:
				System.out.println("Quelle est la premi�re ville que la route doit relier ?");
				Ville v1 = new Ville (sc.next());
				//V�rifier que la ville existe
				System.out.println("Quelle est la seconde ville que la route doit relier ?");
				Ville v2 = new Ville(sc.next());
				//V�rifier que la ville existe
				//Faut-il les int�grer dans un tableau ?
				break;
			case 2:
				sortie = true;
				break;
			default:
				System.out.println("Rentrez une valeur accept�e svp.");
			}
		}
	}
	
	public static void menuEcole() {
		Scanner sc = new Scanner (System.in);
		int choix;
		boolean sortie = false;
		String nomVille;
		while(!sortie) {
			System.out.println("Que voulez-vous faire ?");
			System.out.println("1) Ajouter une �cole");
			System.out.println("2) Retirer une �cole");
			System.out.println("3) Fin");
			choix= sc.nextInt();
			switch(choix) {
			case 1 :
				System.out.println("A quelle ville souhaitez-vous rajouter une �cole ?");
				nomVille=sc.nextLine();
				//Chercher dans le tableau la ville dont le nom correspond � nomVille
				/*V�rifier s'il n'y a pas d�j� une �cole dans la ville 
				 *s'il y en a une et afficher un message si besoin
				 */
				//nomVille.ajoutEcole(); A decommenter quand le tableau de recherche est enlev�e
				//Afficher la liste des villes poss�dant une �cole
				break;
			case 2:
				System.out.println("A quelle ville souhaitez-vous retirer une �cole ?");
				nomVille=sc.nextLine();
				//Chercher dans le tableau la ville dont le nom correspond � nomVille
				/*Faire une recherche pour l'accessibilit� -> V�rifier les routes pour voir si les voisins
				 *ont une �cole chez eux ou dans leur voisinages directs donc premi�re v�rif chez chaque voisin
				 *puis if dans les routes du voisin s'il n'a pas d'�cole chez lui 
				 */
				//nomVille.retireEcole(); A decommenter quand le tableau de recherche est enlev�e
				//Afficher la liste des villes poss�dant une �cole
				break;
			case 3:
				sortie = true;
				break;
			default:
				System.out.println("Rentrez une valeur accept�e svp.");
			}
		}
	}
}

