package com.company;

public class Animal {
    private Integer legs;
    private String color;
    private Boolean vegetarian;
    private Float weight;

    public Animal(){}

    public Integer getLegs()
    {
        return legs;
    }
    public void setLegs(int legs){
        this.legs=legs;

    }

    public String getColor(){
        return color;

    }
    public void setColor(String color)
    {
        this.color=color;
    }
    public Boolean isVegetarian(){
        return vegetarian;
    }
    public void setVegetarian(boolean vegetarian){

        this.vegetarian=vegetarian;
    }
    public Float getWeight(){
        return weight;

    }
    public void setWeight(float weight){

        this.weight=weight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "legs=" + legs +
                ", color='" + color + '\'' +
                ", vegetarian=" + vegetarian +
                ", weight=" + weight +
                '}';
    }
}




