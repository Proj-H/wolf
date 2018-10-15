package wolfsite;

public class Car {
	
	String name;
	int age;
	int noWheels;
	
	public Car(String name, int age, int noWheels) {
		this.name = name;
		this.age = age;
		this.noWheels = noWheels;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getNoWheels() {
		return noWheels;
	}

	public void setNoWheels(int noWheels) {
		this.noWheels = noWheels;
	}
	
	

}
