package fr.diskmth.converter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double aConvertir, convertit = 0;
		char reponse = ' ', mode = ' ';
		
	    System.out.println("CONVERTISSEUR DEGR?S CELSIUS ET DEGR?S FAHRENHEIT");
	    System.out.println("-------------------------------------------------");
	    
	    do{//tant que reponse = O //boucle principale

	        do{//tant que reponse n'est pas 1 ou 2
	          mode = ' ';
	          System.out.println("Choisissez le mode de conversion : ");
	          System.out.println("1 - Convertisseur Celsius - Fahrenheit");
	          System.out.println("2 - Convertisseur Fahrenheit - Celsius ");
	          mode = sc.nextLine().charAt(0);

	          if(mode != '1' && mode != '2')
	            System.out.println("Mode inconnu, veuillez r?it?rer votre choix.");

	        }while (mode != '1' && mode != '2');

	        //saisie de la temp?rature ? convertir
	        System.out.println("Temp?rature ? convertir :");
	        aConvertir = sc.nextDouble();
	        //Pensez ? vider la ligne lue
	        sc.nextLine();

	        //Selon le mode, on calcule diff?remment et on affiche le r?sultat
	        if(mode == '1'){
	          convertit = ((9.0/5.0) * aConvertir) + 32.0;
	          System.out.print(aConvertir + " ?C correspond ? : ");
	          System.out.println(arrondi(convertit, 2) + " ?F.");
	        }
	        else{
	          convertit = ((aConvertir - 32) * 5) / 9;
	          System.out.print(aConvertir + " ?F correspond ? : ");
	          System.out.println(arrondi(convertit, 2) + " ?C.");
	        }

	        //On invite l'utilisateur ? recommencer ou ? quitter
	        do{       
	          System.out.println("Souhaitez-vous convertir une autre temp?rature ?(O/N)");
	          reponse = sc.nextLine().charAt(0);

	        }while(reponse != 'O' && reponse != 'N');

	      }while(reponse == 'O');

	    System.out.println("Au revoir !");

	    //Fin de programme
	}
	    public static double arrondi(double A, int B) {
	      return (double) ( (int) (A * Math.pow(10, B) + .5)) / Math.pow(10, B);
	    } 
}

