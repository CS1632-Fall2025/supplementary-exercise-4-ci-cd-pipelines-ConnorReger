package edu.pitt.cs;

public class CatImpl implements Cat {

	// TODO: Fill in with member variables
	int num;
    String n;
    boolean rent;

	public CatImpl(int id, String name) {
        num = id;
        n = name;
        rent = false;
	}

	public void rentCat() {
		rent = true;
	}

	public void returnCat() {
		rent = false;
	}

	public void renameCat(String name) {
        n = name;
	}

	public String getName() {
		return n;
	}

	public int getId() {
		return num;
	}

	public boolean getRented() {
		return rent;	
	}

	public String toString() {
		return "ID " + num + ". " + n;
	}

}