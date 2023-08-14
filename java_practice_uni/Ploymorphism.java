public class Ploymorphism {
    private String name;
    private int age;
    private float height;

    public Ploymorphism(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Ploymorphism(String name, int age, float height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

}

/*
 * --------------------------------Polymorphism--------------------------------
 * Polymorphism refers to code design having mutliple methods with same name
 * but slightly different functionalities.
 * 
 * There are two basic types of polymorphism:
 * 1): Overriding also called runtime polymorphism.
 * Subclass has the same method as declared in the parent class.
 * 
 * 2): Overloading which is refered to as compile time polymorphism.
 * Compile time polymorphism(Overloading) occurs when you have mutliple methods
 * in the class with the same name but different parameter list.
 * 
 */