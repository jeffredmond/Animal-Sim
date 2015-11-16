 
public class Animal extends Organism{

protected int hunger = 2; 

void decreaseHunger(){
	hunger--; 
}
	Boolean isDead(){
		if(hunger == 0){
			return true;}
			return false; 
		}
	}

