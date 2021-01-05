package codinGame;

import java.util.Scanner;

public class ExerciceCodinGame4 {

	public static void main(String[] args) {
		System.out.println("Ojectif : \n" + 
		"You must help Gary move X boxes. He can carry one box per N minutes, but he only has T hours to do so. You promised to help, but since you're very lazy, you will only carry the minimum number of boxes that are required for Gary to finish.");
		System.out.println("Contraintes :\r\n" + 
				"0 <= X < 1000 : Le nombre de carton que Gary doit d�placer \r\n" + 
				"0 < N < 61 : Nombre de minutes pour d�placer 1 carton \r\n" + 
				"0 <= T <= 24 : Le temps allou� � Gary pour r�aliser la t�che. ");
		System.out.println("-----------------------------------");
		Scanner in = new Scanner(System.in);
		System.out.println("X : ");
        int X = in.nextInt();
        System.out.println("N : ");
        int N = in.nextInt();
        System.out.println("T : ");
        int T = in.nextInt();
        System.out.println("-----------------------------------");
        //Calculer le nombre de carton que Gary peut d�placer 
        int nbGaryCarton = ((N * 60)* T);
        System.out.println("Gary peut d�placer en " + T + " heures " + nbGaryCarton + " cartons");
        //D�duire le nombre de carton que gary peut d�placer � l'objectif X 
        int nbMinCartonADeplacer = X - nbGaryCarton; 
        System.out.println("Pour aider Gary, je dois d�placer " + nbMinCartonADeplacer + " cartons");
        
	}

}
