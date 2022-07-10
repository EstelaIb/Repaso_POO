package Ejecucion;
//IMPORT PACKAGE
import Panadero.Baker;
import Programador.Programmer;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Object>pro = new ArrayList<Object>();
        ArrayList<Object>baquer = new ArrayList<Object>();
        int number = Integer.parseInt(JOptionPane.showInputDialog(null,"Number of programmers: ","PROGRAMMERS",JOptionPane.QUESTION_MESSAGE));
        for (int i = 1; i<=number; i++){
            String name = JOptionPane.showInputDialog(null,"Name:","PROGRAMMERS",JOptionPane.QUESTION_MESSAGE);
            String lname = JOptionPane.showInputDialog(null,"Lastname:","PROGRAMMERS",JOptionPane.QUESTION_MESSAGE);
            int age = Integer.parseInt(JOptionPane.showInputDialog(null,"Age: ","PROGRAMMERS",JOptionPane.QUESTION_MESSAGE));
            int ci = Integer.parseInt(JOptionPane.showInputDialog(null,"CI: ","PROGRAMMERS",JOptionPane.QUESTION_MESSAGE));
            int telf = Integer.parseInt(JOptionPane.showInputDialog(null,"Telf: ","PROGRAMMERS",JOptionPane.QUESTION_MESSAGE));
            String lprogram = JOptionPane.showInputDialog(null,"Lenguaje programming: ","PROGRAMMERS",JOptionPane.QUESTION_MESSAGE);
            pro.add(new Programmer(name,lname,age,ci,telf,lprogram));
        }
        int number2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Number of bakers: ","BAKERS",JOptionPane.QUESTION_MESSAGE));
        for (int i = 1; i<=number2; i++){
            String name2 = JOptionPane.showInputDialog(null,"Name:","BAKERS",JOptionPane.QUESTION_MESSAGE);
            String lname2 = JOptionPane.showInputDialog(null,"Lastname:","BAKERS",JOptionPane.QUESTION_MESSAGE);
            int age2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Age: ","BAKERS",JOptionPane.QUESTION_MESSAGE));
            int ci2 = Integer.parseInt(JOptionPane.showInputDialog(null,"CI: ","BAKERS",JOptionPane.QUESTION_MESSAGE));
            int telf2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Telf: ","BAKERS",JOptionPane.QUESTION_MESSAGE));
            String special = JOptionPane.showInputDialog(null,"Speciality: ","BAKERS",JOptionPane.QUESTION_MESSAGE);
            baquer.add(new Baker(name2,lname2,age2,ci2,telf2,special));
        }
    }
}
