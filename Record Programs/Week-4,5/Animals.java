package javaprograms;
import java.util.Scanner;

class Animal {
    String name, place, food;

    public Animal(String name, String place, String food) {
        this.name = name;
        this.place = place;
        this.food = food;
    }

    void display(String sound) {
        System.out.println(name + " stays in " + place +
                ", eats " + food +
                ", makes " + sound + " sound");
    }
}

public class Animals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter cow place: ");
        String cp = sc.nextLine();
        System.out.print("Enter cow food: ");
        String cf = sc.nextLine();

        System.out.print("Enter pig place: ");
        String pp = sc.nextLine();
        System.out.print("Enter pig food: ");
        String pf = sc.nextLine();

        System.out.print("Enter horse place: ");
        String hp = sc.nextLine();
        System.out.print("Enter horse food: ");
        String hf = sc.nextLine();

        Animal cow = new Animal("Cow", cp, cf);
        Animal pig = new Animal("Pig", pp, pf);
        Animal horse = new Animal("Horse", hp, hf);

        cow.display("Moo");
        pig.display("Oink");
        horse.display("Neigh");
    }
}
/*Enter cow place: Shed
Enter cow food: Grass
Enter pig place: Pen
Enter pig food: Grains
Enter horse place: Stable
Enter horse food: Grass

Cow stays in Shed, eats Grass, makes Moo sound
Pig stays in Pen, eats Grains, makes Oink sound
Horse stays in Stable, eats Grass, makes Neigh sound*/
