package Clase_Persona;
//MAIN CLASS
public class People {
    String name;
    String lastname;
    int age;
    int ci;
    int telf;
    //CREATE BUILDER
    public People(String name, String lastname, int age, int ci, int telf){
         this.name = name;
         this.lastname = name;
         this.age = age;
         this.ci = ci;
         this.telf = telf;
    }
    //PERSON CLASS METHOD
    public String toString (){
        return("------The person's information is: " +
                "\n>Full Name" + this.name + this.lastname + "------"+
                "\n> Age: " + this.age +
                "\n> CI: " + this.ci +
                "\n> Cellphone: " + this.telf );
    }
}
