package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        System.out.println("\nCreating DVD Object and testing toString method:");
        DVD starWars = new DVD("Star Wars", 5);
        System.out.println(starWars.toString());

        System.out.println("\nTesting the write method followed by the read method:");
        starWars.write("Episode I: The Phantom Menace");
        starWars.write("Episode II: Attack of the Clones");
        starWars.write("Episode III: Revenge of the Sith");
        starWars.write("Episode IV: A New Hope");
        starWars.write("Episode V: The Empire Strikes Back");
        starWars.write("Episode VI: Return of the Jedi");
        starWars.read();

        System.out.println("\nTesting the spinDisc method followed by the playMovie method:");
        starWars.spinDisc();
        starWars.playMovie();

        System.out.println("\nCreating a CD object and testing the playMusic method:");
        CD weezer = new CD("Weezer", 1);
        weezer.playMusic();

    }
}
