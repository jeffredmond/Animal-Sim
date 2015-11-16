import java.util.Scanner; 
import java.util.Random; 
class world {
	
	private static final int Catipillar = 0;

	public static void main(String[] args){
		
		Location simulation = new Location(); 
		
		
		/*
		   int k = 0; 
		 
		 
		for (int i = 0; i < simulation.world.length; i ++ ){
			for (int j = 0; j < simulation.world[i].length; j++){
				simulation.world[i][j]= new Organism(k);
				k++; 
			}
		}
		
		for (int i = 0; i < simulation.world.length; i ++ ){
			for (int j = 0; j < simulation.world[i].length; j++){
				System.out.print(simulation.world[i][j].getx());
			}
			System.out.println('\n');
		}
		
		
		simulation = null; 
		*/
		
		int Caterpillar, BlueJay, Hawk, Grasshopper, Mouse, Grass, 
		Rabbit, Squirrel, Fox, Wolf, Deer; 
		int counter = 0;
		Random random = new Random(); 
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter the initial populations for your world \n");
		
		System.out.println("Please enter the initial population for the caterpillar  \n");
		Caterpillar= in.nextInt();
		
		while(counter < Caterpillar){
		    int randRow = random.nextInt(150 - 1);
		    int randColumn = random.nextInt(150 - 1);
		    if (simulation.world[randRow][randColumn] == null) {
		        simulation.world[randRow][randColumn] = new Caterpillar();
		        ++ counter;
		    }
		}
		counter = 0; 
		
		System.out.println("Please enter the initial population for the Blue Jay \n");
		BlueJay= in.nextInt();
		
		while(counter < BlueJay){
		    int randRow = random.nextInt(150 - 1);
		    int randColumn = random.nextInt(150 - 1);
		    if (simulation.world[randRow][randColumn] == null) {
		        simulation.world[randRow][randColumn] = new BlueJay();
		        ++ counter;
		    }
		}
		counter = 0; 
		
		System.out.println("Please enter the initial population for the Hawk \n"); 
		Hawk= in.nextInt();
		
		while(counter < Hawk){
		    int randRow = random.nextInt(150 - 1);
		    int randColumn = random.nextInt(150 - 1);
		    if (simulation.world[randRow][randColumn] == null) {
		        simulation.world[randRow][randColumn] = new Hawk();
		        ++ counter;
		    }
		}
		counter = 0; 
		
		System.out.println("Please enter the initial population for the Grasshopper \n");
		Grasshopper= in.nextInt();
		
		while(counter < Grasshopper){
		    int randRow = random.nextInt(150 - 1);
		    int randColumn = random.nextInt(150 - 1);
		    if (simulation.world[randRow][randColumn] == null) {
		        simulation.world[randRow][randColumn] = new Grasshopper();
		        ++ counter;
		    }
		}
		counter = 0; 
		
		
		System.out.println("Please enter the initial population for the Mouse \n");
		Mouse= in.nextInt();
		
		while(counter < Mouse){
		    int randRow = random.nextInt(150 - 1);
		    int randColumn = random.nextInt(150 - 1);
		    if (simulation.world[randRow][randColumn] == null) {
		        simulation.world[randRow][randColumn] = new Mouse();
		        ++ counter;
		    }
		}
		counter = 0; 
		
		
		System.out.println("Please enter the initial population for the Grass \n"); 
		Grass= in.nextInt();
		
		while(counter < Grass){
		    int randRow = random.nextInt(150 - 1);
		    int randColumn = random.nextInt(150 - 1);
		    if (simulation.world[randRow][randColumn] == null) {
		        simulation.world[randRow][randColumn] = new Grass();
		        ++ counter;
		    }
		}
		counter = 0; 
		
		System.out.println("Please enter the initial population for the Rabbit \n"); 
		Rabbit= in.nextInt();
		
		while(counter < Rabbit){
		    int randRow = random.nextInt(150 - 1);
		    int randColumn = random.nextInt(150 - 1);
		    if (simulation.world[randRow][randColumn] == null) {
		        simulation.world[randRow][randColumn] = new Rabbit();
		        ++ counter;
		    }
		}
		counter = 0; 
		
		System.out.println("Please enter the initial population for the Squirrel \n");
		Squirrel= in.nextInt();
		
		while(counter < Squirrel){
		    int randRow = random.nextInt(150 - 1);
		    int randColumn = random.nextInt(150 - 1);
		    if (simulation.world[randRow][randColumn] == null) {
		        simulation.world[randRow][randColumn] = new Squirrel();
		        ++ counter;
		    }
		}
		counter = 0; 
		
		System.out.println("Please enter the initial population for the Fox \n");
		Fox = in.nextInt();
		
		while(counter < Fox){
		    int randRow = random.nextInt(150 - 1);
		    int randColumn = random.nextInt(150 - 1);
		    if (simulation.world[randRow][randColumn] == null) {
		        simulation.world[randRow][randColumn] = new Fox();
		        ++ counter;
		    }
		}
		counter = 0; 
		
		System.out.println("Please enter the initial population for the Wolf \n"); 
		Wolf = in.nextInt();
		
		while(counter < Wolf){
		    int randRow = random.nextInt(150 - 1);
		    int randColumn = random.nextInt(150 - 1);
		    if (simulation.world[randRow][randColumn] == null) {
		        simulation.world[randRow][randColumn] = new Wolf();
		        ++ counter;
		    }
		}
		counter = 0; 
		
		System.out.println("Please enter the initial population for the Deer \n");		
		Deer = in.nextInt();
		
		while(counter < Deer){
		    int randRow = random.nextInt(150 - 1);
		    int randColumn = random.nextInt(150 - 1);
		    if (simulation.world[randRow][randColumn] == null) {
		        simulation.world[randRow][randColumn] = new Deer();
		        ++ counter;
		    }
		}
		counter = 0; 
		
		for (int i = 0; i < 150; i ++ ){
			for (int j = 0; j < 150; j++){
				if(simulation.world[i][j] == null){
					System.out.print("");
				}else 
				System.out.print(" " + simulation.world[i][j].name + 
				" At location " + i + " " + j + "\n"  );
			}
			
		}
		
		simulation = null; 
	
		
	}
}

