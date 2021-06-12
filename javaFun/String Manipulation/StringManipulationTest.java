public class StringManipulationTest{
    public static void main(String[] args){
        StringManipulator x = new StringManipulator();
        System.out.println(x.trimAndConcat(" Hello      ","     World   "));

        char letter = 'o';
        Integer a = x.getIndexOrNull("Coding", letter);
        Integer b = x.getIndexOrNull("Hello World", letter);
        Integer c = x.getIndexOrNull("Hi", letter);
        System.out.println(a); // 1
        System.out.println(b); // 4
        System.out.println(c); // null

        
        String word = "Hello";
        String subString = "llo";
        String notSubString = "world";
        Integer f = x.getIndexOrNull(word, subString);
        Integer d = x.getIndexOrNull(word, notSubString);
        System.out.println(f); // 2
        System.out.println(d); // null


        String str6= x.concatSubstring("Hello", 1, 2,"world");
        System.out.println(str6); // eworld

    }
}


