package exampleExercises.exampleExercise4;

public class Main {

	public static void main(String[] args) {
		// //We need a variable to store names, numbers...and that variable is Kingdom
				Kingdom Lannister= new Kingdom();
				Lannister.name="Lannister";
				Lannister.motto="Hear me roar!";
				Lannister.maxPop=100;
				Lannister.population=70;
				Lannister.maxBuild=30;
				Lannister.building=20;
				//This is the way to store the data
				Kingdom Baratheon=new Kingdom();
				Baratheon.name="Baratheon";
				Baratheon.motto="Ours is the fury";
				Baratheon.maxPop=60;
				Baratheon.population=50;
				Baratheon.maxBuild=30;
				Baratheon.building=17;
				
				Kingdom Stark=new Kingdom();
				Stark.name="Stark";
				Stark.motto="Winter is coming";
				Stark.maxPop=30;
				Stark.population=10;
				Stark.maxBuild=7;
				Stark.building=3;
				
				//BUILDINGS:
				
				Building HouseA=new Building();
				HouseA.name="HouseA";
				HouseA.description="Eat and sleep";
				HouseA.workers=0;
				HouseA.vacancies=1;
				HouseA.belongsTo=Lannister;
				HouseA.type="Family";
				
				Building PalaceA=new Building();
				PalaceA.name="PalaceA";
				PalaceA.description="Rule the city";
				PalaceA.workers=20;
				PalaceA.vacancies=2;
				PalaceA.belongsTo=Lannister;
				PalaceA.type="Producer";
				
				Person Cersei=new Person();
				Cersei.name="Cersei";
				Cersei.age=30;
				Cersei.citizenOf=Lannister;
				Cersei.work=true;
				Cersei.house=HouseA;
				Cersei.workPlace=PalaceA;
				Cersei.skill="defense";
				
				System.out.println(HouseA.belongsTo.name);
				System.out.println(Cersei.house.belongsTo.motto);

	}

}
