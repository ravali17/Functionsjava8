import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FuctionPrograms3 {
    public static void main(String[] args) {
        List<Integer> mylist=new ArrayList<Integer>();
        mylist.add(10);
        mylist.add(20);
//        Function<Integer,Void>display=(x)-> {
//            System.out.println(x);
//        };
        mylist.stream().forEach((x)-> {
            System.out.println(x);
        });

    }

}
