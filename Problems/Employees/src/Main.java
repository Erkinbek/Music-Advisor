class Employee {

    public String name;
    public String email;
    public int experience;

	public Employee(String name, String email, int experience) {
		this.name = name;
		this.email = email;
		this.experience = experience;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}
}

class Developer extends Employee {

    public String mainLanguage;
    public String[] skills;

	public Developer(String name, String email, int experience, String mainLanguage, String[] skills) {
		super(name, email, experience);
		this.mainLanguage = mainLanguage;
		this.skills = skills;
	}

	public String getMainLanguage() {
		return mainLanguage;
	}

	public void setMainLanguage(String mainLanguage) {
		this.mainLanguage = mainLanguage;
	}

	public String[] getSkills() {
		return skills;
	}

	public void setSkills(String[] skills) {
		this.skills = skills;
	}
}

class DataAnalyst extends Employee {

    public Boolean phd;
    public String[] methods;

	public DataAnalyst(String name, String email, int experience, Boolean phd, String[] methods) {
		super(name, email, experience);
		this.phd = phd;
		this.methods = methods;
	}

	public Boolean isPhd() {
		return phd;
	}

	public void setPhd(Boolean phd) {
		this.phd = phd;
	}

	public String[] getMethods() {
		return methods;
	}

	public void setMethods(String[] methods) {
		this.methods = methods;
	}
}