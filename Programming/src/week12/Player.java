package week12;

/**
 * 
 * @author Javier Aspiroz de la Calle & Borja Arán Tejada
 * @since November 2016
 * @version 1.0
 *
 */

public class Player {
	private String name, strategy; 
	private String [] object=new String[25];
	private byte score=0, round=0;
	public void setScore(byte score){
		this.score=score;
	}
	public byte getScore(){
		return this.score;
	}
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		//Nothing must be checked
		this.name=name;
	}
	public String getStrategy() {
		return strategy;
	}

	public void setStrategy(String strategy) {
		this.strategy = strategy;
	}

	public String[] getObject() {
		return object;
	}
	public String getObjectChoice(int pos) {
		return object[pos];
	}
	

	public void setObject(String[] object) {
		this.object = object;
	}

	public byte getRound() {
		return round;
	}

	public void setRound(byte round) {
		this.round = round;
	}
	public void choosing (String winningElection){
		if (strategy.equals("random") || strategy.equals("Random")){
			int option = (int)(Math.random()*3);
			switch(option){
			case 0: object[round] = "Rock";
			break;
			case 1: object[round] = "Paper";
			break;
			case 2: object[round] = "Scissors";	
			}
		}
		else if(strategy.equals("Cyclic") || strategy.equals("cyclic")){
			if(round>0){
				if(object[round-1].equals("Rock")){
					object[round]="Paper";
				}
				else if(object[round-1].equals("Paper")){
					object[round]="Scissors";
				}
				else{
					object[round]="Rock";
				}
			}
			else{
				object[round]="Rock";
			}
		}
		else if(strategy.equals("copy") || strategy.equals("Copy")){
			if(round>0){
				object[round]=winningElection;
			}
		}
		else{//We set the random too, as he is supposed to have no idea.
			if(round>0){
				object[round]=winningElection;
			}
			else{
				int option = (int)(Math.random()*3);
				switch(option){
				case 0: object[round] = "Rock";
				break;
				case 1: object[round] = "Paper";
				break;
				case 2: object[round] = "Scissors";	
				}
			}
		}
	}
	public Player(String name, String  strategy){
		setName(name);
		if(strategy.equals("Random") || strategy.equals("Cyclic") || strategy.equals("Copy")|| 
				strategy.equals("random") || strategy.equals("cyclic") || strategy.equals("copy")){
			this.strategy=strategy;
		}
		else{
			this.strategy="Random";
		}
	}
}
