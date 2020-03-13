package _03_smurf;

public class Smurf_Runner {
public static void main(String[] args) {
	Smurf handy = new Smurf("Handy");
	handy.eat();
	handy.getName();
	System.out.println(handy.getName());
	Smurf papa = new Smurf("Papa");
	papa.getName();
	System.out.println(papa.getName());
	papa.getHatColor();
	System.out.println(papa.getHatColor());
	papa.isGirlOrBoy();
	System.out.println(papa.isGirlOrBoy());
	Smurf smurfette = new Smurf("Smurfette");
	smurfette.getName();
	System.out.println(smurfette.getName());
	smurfette.getHatColor();
	System.out.println(smurfette.getHatColor());
	smurfette.isGirlOrBoy();
	System.out.println(smurfette.isGirlOrBoy());
	}
}
