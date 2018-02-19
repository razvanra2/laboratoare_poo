import java.util.*;
class Zoo {
    Vector<Animal> animals = new Vector<Animal>();

    boolean addAnimal(Animal a) {
        return animals.add(a);
    }

    boolean removeAnimal(Animal a) {
        return animals.remove(a);
    }

    Vector<Animal> getAnimals() {
        return this.animals;
    }
    boolean areAnimals() {
        return !this.animals.isEmpty();
    }

    int size() {
        return this.animals.size();
    }
}
