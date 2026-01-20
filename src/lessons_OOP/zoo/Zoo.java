package lessons_OOP.zoo;

public class Zoo {
    Animal[] animals = new Animal[50];
    int count = 0;

    public void addAnimal(Animal animal) {
        if (count < animals.length) {
            animals[count] = animal;
            count++;
        }
    }

    public void printAnimals() {
        for (Animal animal: animals) {
            System.out.println(animal);
        }
    }


    Animal differentAnimal = animals[0];

}
