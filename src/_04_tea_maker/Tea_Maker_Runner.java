package _04_tea_maker;

public class Tea_Maker_Runner {
public static void main(String[] args) {
	TeaBag tea = new TeaBag("Passion Fruit");
	tea.getFlavor();
	Kettle k = new Kettle();
	k.getWater();
	k.boil();
	Cup c = new Cup();
	c.makeTea(tea, k.getWater());
}
}
