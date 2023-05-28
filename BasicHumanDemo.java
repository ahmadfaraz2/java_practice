public class BasicHumanDemo{
    public static void main(String[] args){
        
        Human human = new Human();
        human.name = "Ahmad";
        human.age = 20;
        human.height = 1.91f;
                
        System.out.println("name: "+ human.name);
        System.out.println("age: "+ human.age);
        System.out.println("height: "+ human.height);


        // Sample testing a Constant

        Human ahmad = new Human();
        ahmad.name = "Ahmad Faraz";
        ahmad.age = 21;
        ahmad.height = 2.0f;

        System.out.println("Ahmad's LifeSpan = " + ahmad.LIFESPAN);
        System.out.println("human's LifeSpan = " + human.LIFESPAN);
        System.out.println("Human LifeSpan = " + Human.LIFESPAN);




        // Using Human Instance with Getters and Setters

        Human faraz = new Human();
        faraz.setName("Faraz");
        faraz.setAge(20);
        faraz.setHeight(2.0f);

        System.out.println("name: "+ faraz.getName());
        System.out.println("age: " + faraz.getAge());
        System.out.println("height: " + faraz.getHeight());
            
    }
}
