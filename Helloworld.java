import java.util.List;
public class Helloworld{
    public static void main(String[] args){
        System.out.println("Helloworld");

        List<String> items = List.of("1", "a", "2", "a", "3", "a");

        items.forEach(item ->{
            if (item.equals("a")){
                System.out.println("A");
            }
            else {
                System.out.println("Not A");
            }
        });
    }
}