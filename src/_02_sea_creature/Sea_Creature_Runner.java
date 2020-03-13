package _02_sea_creature;

public class Sea_Creature_Runner {
	public static void main(String[] args) {
		SeaCreature spongebob = new SeaCreature("Spongebob");
		spongebob.eat();
		spongebob.laugh();
		SeaCreature patrick = new SeaCreature("Patrick");
		patrick.getName();
		System.out.println(patrick.getName());
		patrick.eat();
		patrick.laugh();
		SeaCreature squidward = new SeaCreature("squidward");
		squidward.getName();
		System.out.println(squidward.getName());
		squidward.eat();
		squidward.laugh();
	}

}
