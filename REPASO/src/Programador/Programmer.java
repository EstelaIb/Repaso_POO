package Programador;
//IMPORT PACKAGE
import Clase_Persona.People;

//INHERIT FROM CLASS PEOPLE
public class Programmer extends People {
    //PRIVATE ATTRIBUTES
    private String lenguajes;
    public Programmer(String name, String lastname, int age, int ci, int telf, String lenguajes) {
        super(name, lastname, age, ci, telf);

        this.lenguajes = lenguajes;
    }
    //GENERATE SETTER AND GETTER

    public String getLenguajes() {
        return lenguajes;
    }

    public void setLenguajes(String lenguajes) {
        this.lenguajes = lenguajes;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n> Lenguajes Programming: " + this.lenguajes;
    }
}
