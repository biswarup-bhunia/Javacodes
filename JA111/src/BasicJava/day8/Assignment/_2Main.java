package BasicJava.day8.Assignment;

public class _2Main {
    public static void main(String[] args) {
        Animal[] arr = new Animal[3];
        Dog tomy = new Dog();
        Cat pussy = new Cat();
        Tiger sera = new Tiger();
        arr[0] = tomy;
        arr[1] = pussy;
        arr[2] = sera;

        for (Animal x : arr){
            x.makeNoise();
            x.walk();
            x.eat();
        }
    }
}

class Animal{
    public void makeNoise(){
        System.out.println("Animal making Noise");
    }
    public void eat(){
        System.out.println("Animal is eating");
    }
    public void walk(){
        System.out.println("Animal is walking");
    }
}

class Dog extends Animal{
    @Override
    public void makeNoise(){
        System.out.println("Barking...");
    }
}

class Cat extends Animal{
    @Override
    public void makeNoise(){
        System.out.println("Meaw...");
    }
}
class Tiger extends Animal{
    @Override
    public void makeNoise(){
        System.out.println("Raoring...");
    }
}
