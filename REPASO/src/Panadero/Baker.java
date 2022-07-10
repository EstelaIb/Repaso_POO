package Panadero;
//IMPORT PACKAGE
import  Clase_Persona.People;
//INHERIT FROM CLASS PEOPLE
public class Baker extends People{
    //BAKER CLASS PRIVATE ATTRIBUTES
    private String speciality;
    //SUMMON THE BUILDER
    public Baker(String name, String lastname, int age, int ci, int telf, String speciality) {
        super(name, lastname, age, ci, telf);
        this.speciality = speciality;
    }
    //GENERATE SETTER AND GETTER FOR PRIVATE ATTRIBUTES
    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n> Speciality: " + this.speciality;
    }
}
