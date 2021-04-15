package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Animal caine1 = new Animal();
        caine1.name = "Ursa";
        caine1.race = "Labrador";
        caine1.color = "Black";
        caine1.maxSpeedRun = 20;

        System.out.println("The dog's name is " + caine1.name);
        System.out.println("Race of this dog is " + caine1.race);
        System.out.println("Color of this dog is " + caine1.color);
        System.out.println("The speed of the dog is" + caine1.maxSpeedRun);

        AnimalAdopter adopter1 = new AnimalAdopter();
        adopter1.name = "John";
        adopter1.age = 21;
        adopter1.married = true;

        System.out.println("The adopter's name is " + adopter1.name);
        System.out.println("Adopter age is " + adopter1.age);
        System.out.println("Marital status is " + adopter1.married);


        PetFood food = new PetFood();
        food.name = "Brit Premium";
        food.maxKiloFood = 0.5;

        System.out.println("Dog food names " + food.name);
        System.out.println("The amount of food an animal eats " + food.maxKiloFood );

        Veterinarian doctor = new Veterinarian();
        doctor.name = "Michael";
        doctor.age = 30;
        doctor.region = "Cluj-Napoca";

        System.out.println("The doctor's name" + doctor.name);
        System.out.println("The doctor's age " + doctor.age);
        System.out.println("The doctor's region " + doctor.region);






    }

}
