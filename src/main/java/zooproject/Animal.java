package zooproject;

public class Animal {
    public String animalName; //instance variables line 4-8
    public long population;
    public double animalWeight[];

    public String animalSound;
// adding a constructor to initialize variables
    public Animal(String animalName, long population, double[] animalWeight, String animalSound){
        this.animalName=animalName;
        this.population=population;
        this.animalWeight=animalWeight;
        this.animalSound=animalSound;
    }

    public void printAnimalSound(){
        System.out.println("The " + animalName + "makes this sound " + animalSound);
    }
    public void printAnimalWeight(){
        for (int i=0; i<animalWeight.length; i++){
            System.out.println(animalWeight[i]);
        }
    }
}