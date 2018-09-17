
public class Player {
	private String name;
	private String country;
	private String skill;
	
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
