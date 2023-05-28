import java.util.List;

public class MultipleStatementsSample{
    public static void main(String[] args){

        List<String> item1 = List.of("1", "a", "2", "a", "3", "a");

        List<String> item2 =
                List.of("1", "a", "2", "b", "3", "c");

        List<String> item3 =
                List.of("1", "a", "2",
                    "a", "3", "a");        

        System.out.println(item1);
        System.out.println(item2);
        System.out.println(item3);            
    }
}