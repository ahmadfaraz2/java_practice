public class BasicHumanDemo{
    public static void main(String[] args){
        
        Human human = new Human();
        human.name = "Ahmad";
        human.age = 20;
        human.height = 1.91f;
                
        System.out.println("name: "+ human.name);
        System.out.println("age: "+ human.age);
        System.out.println("height: "+ human.height);
            
    }
}
