package codinGame;

import java.util.Scanner;

public class ExerciceCodinGame4 {

	public static void main(String[] args) {
		System.out.println("Ojectif : \n" + 
		"You must help Gary move X boxes. He can carry one box per N minutes, but he only has T hours to do so. You promised to help, but since you're very lazy, you will only carry the minimum number of boxes that are required for Gary to finish.");
		System.out.println("Contraintes :\r\n" + 
				"0 <= X < 1000 : Le nombre de carton que Gary doit déplacer \r\n" + 
				"0 < N < 61 : Nombre de minutes pour déplacer 1 carton \r\n" + 
				"0 <= T <= 24 : Le temps alloué à Gary pour réaliser la tâche. ");
		System.out.println("-----------------------------------");
		Scanner in = new Scanner(System.in);
		System.out.println("X : ");
        int X = in.nextInt();
        System.out.println("N : ");
        int N = in.nextInt();
        System.out.println("T : ");
        int T = in.nextInt();
        System.out.println("-----------------------------------");
        //Calculer le nombre de carton que Gary peut déplacer 
        int nbGaryCarton = ((N * 60)* T);
        System.out.println("Gary peut déplacer en " + T + " heures " + nbGaryCarton + " cartons");
        //Déduire le nombre de carton que gary peut déplacer à l'objectif X 
        int nbMinCartonADeplacer = X - nbGaryCarton; 
        System.out.println("Pour aider Gary, je dois déplacer " + nbMinCartonADeplacer + " cartons");
        
	}

}
