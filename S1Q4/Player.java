
public class Player {
	private String name;
	private String country;
	private String skill;
	
	Player(String name, String country, String skill) {
		this.name = name;
		this.country = country;
		this.skill = skill;
	}
	
	public void displayPlayerDetails() {
		System.out.println(this.name + ", " + this.country + ", " + this.skill);
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}
	
	
}
