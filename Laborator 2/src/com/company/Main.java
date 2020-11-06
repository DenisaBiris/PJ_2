package com.company;


import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        // write your code here

        int x = Integer.parseInt(JOptionPane.showInputDialog(null,"Introduceti numarul de instante:"));
        for(int i=0;i<x;i++){
            Animal animal = new Animal();
            animal.setLegs(Integer.parseInt(JOptionPane.showInputDialog(null, "Introduceti numarul de membre: ")));
            animal.setColor(JOptionPane.showInputDialog(null, "Introduceti culoarea: "));
            animal.setVegetarian(Boolean.parseBoolean(String.valueOf(JOptionPane.showConfirmDialog(null, "Erbivor? "))));
            animal.setWeight(Float.parseFloat(JOptionPane.showInputDialog(null, "Introduceti greutatea: ")));

            JOptionPane.showMessageDialog(null,animal.toString());
        }

    }}
