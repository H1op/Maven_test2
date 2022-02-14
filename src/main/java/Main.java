import animals.MyIterator;

import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TestIterable<String> myIterable = new TestIterable<>();
        myIterable.add("Test1");
        myIterable.add("Test2");
        myIterable.add("Test3");
        Iterator<String> myIterator = myIterable.iterator();
        while (myIterator.hasNext()) {
            String string = myIterator.next();
            System.out.println(string);
            System.out.println(string);
            System.out.println(string);
        }
    }
}
