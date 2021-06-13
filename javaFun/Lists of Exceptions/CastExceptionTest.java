import java.util.*;

public class CastExceptionTest{
    public static void main(String[] args){
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");

        for(int i = 0; i < myList.size(); i++) {
        try {
            
            Integer castedValue = (Integer) myList.get(i);

            System.out.println("it's casted");
            }
            
            
        catch (Exception e) {
            System.out.println("can't be casted");
        }
    }
       
    }
}