public class Human {
    public static final int LIFESPAN = 100;
    private String name;
    private int age;
    private float height;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getHeight() {
        return this.height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

}

/*
 * 
 * ----------------------------Ecapsulation--------------------------------
 * Encapsulation is the process of hiding data implementation by restricting
 * access to using special methods called getters and setters.
 * 
 * 
 * The encapsulation principle refers to hiding of data implementation by
 * restricting access to it using special methods called getters and setters.
 * 
 * 
 * ----------------------------this keyword----------------------------------
 * "this" :
 * It is the reference to current object.
 * 
 * Inside class body, this is used to access fields for the current objects
 * when there are parameters in methods that have the same name.
 * 
 * 
 * -------------------------------Getters-------------------------------------
 * Getters are the simplest methods that are declared without any parameter,
 * and return the value of field they are associated with.
 * 
 * For example:
 * 
 * public String getName(){
 * return this.name;
 * }
 * 
 * -------------------------------Setters---------------------------------------
 * -
 * Setters are the simplest methods that returns nothing and declare as a
 * parameter a variable with the same type that need to be associated to the
 * field.
 * 
 * For Example:
 * 
 * public void setName(String name){
 * this.name = name;
 * }
 * 
 * --------------------------------void------------------------------------
 * void is the special type that tells the compiler that methods does not
 * return anything, thus no return statement is present in the method body.
 */