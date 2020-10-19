/**
 * 
 * @author Joey Santillo CIT 591 Fall 2020, Midterm 1
 *
 */

public class Mosquito {

    String species;
    String gender;

    Mosquito(String species, String gender) {
	this.species = species;
	this.gender = gender;
    }

    public String getSpecies() {
	return species;
    }

    public void setSpecies(String species) {
	this.species = species;
    }

    public String getGender() {
	return gender;
    }

    public void setGender(String gender) {
	this.gender = gender;
    }

}
