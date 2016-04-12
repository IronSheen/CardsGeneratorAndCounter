
public class main {
	public static void main(String[] args){
		
		//Fort�ller hvor mange kort der er i et kortd�k
		int[] deck = new int[52]; //Der er 52 kort i et kortd�k uden jokere
		String[] type = {"Hjerter", "Spar", "Ruder", "Kl�ver"}; //Indensholder de forksllige typer kort
		String[] tal = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "Kn�gt", "Dronning", "Konge"}; //Indeholder de forskellige slags tal
		
		//Tjekker de givende kort
		for (int i = 0; i < deck.length; i++){	
			deck[i] += i;
		}
		
		//Blander de forskellige kort
		for (int i = 0; i < deck.length; i++){
			int tag = (int)(Math.random() * deck.length); //V�lger et tilf�ldig sted i bunken af kort
			int x = deck[i]; //Laver en midlertideligt varriabel som holder vores kort
			deck[i] = deck[tag]; //S�tter det valgte kort, et tilf�ldig sted
			deck[tag] = x; //S�tter (tilf�ldig sted) i en midlertidelig v�rdi
		}
		
		for (int i = 0; i < 4; i++){
			String type = typer[deck[i] / 13]; 
			String tal = tallene[deck[i] % 13];
			System.out.println("Du har f�et " + type + " af " + tal);
		}
	}
}
