package _07_tea_party;

public class TeaParty {
	private String name;
	private boolean isWoman;
	private boolean isKnighted;
	private String isWoman1;
	private String isKnighted1;
	TeaParty() {
	}
	  public String welcome(String name, boolean isWoman, boolean isKnighted) {
		  	this.name = name;
			this.isWoman = isWoman;
			this.isKnighted = isKnighted;
			if(isWoman==true) {
				isWoman1 = "Ms.";
			}
			else if (isWoman == false){
				isWoman1 = "Mr.";
			}
			if (isKnighted == true) {
				isWoman1 = "Sir";
			}
			else if (isKnighted == false) {
				isKnighted1 = "";
			}
			
			return "Hello " + isWoman1 + " " + isKnighted1 + name;
			//"Hello Ms. _ Austen
      }

	 
}
	  
	
