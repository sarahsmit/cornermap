package main.java.com.cvillecorner.fullservice;

public class House {

    private final int number;
    private final String street;
	private final String name;

	public House(int number, String street, String name) {
		this.number = number;
        this.street = street;
        this.name = name;
    }

    public House(int number, String street) {
		this.number = number;
        this.street = street;
        this.name = "";
	}

	public int getNumber() {
		return number;
    }
    
    public String getStreet() {
        return street;
    }

    public String getName() {
        return name;
    }
}