import java.util.Locale;

public class StringPractice {
    public static void main(String[] args) {


        String str = "IntelliJ is the BEst editor in the programming world!";
        String str2 = "IntelliJ is the BEst editor in the programming world!";
        //System.out.println(str.toLowerCase()); // make it to lower cases
        //System.out.println(str.toUpperCase()); // make it to upper case
        //System.out.println(str.trim()); // remove all the blank spaces

/*
        if (str.toLowerCase().contains("best") ){
            System.out.println("String best exists");
        }

        System.out.println(str.endsWith("!"));

        System.out.println(str.startsWith("Inte"));
        System.out.println(str.contentEquals(str2)); // check both the strings equality and also the cases Upper/Lower
        System.out.println(str.indexOf('I')); // gives the first index which is 0
        System.out.println(str.lastIndexOf("the"));
        System.out.println(str.length());
        System.out.println(str.substring(3));// start from index 3 to the length of the string
        System.out.println(str.substring(0, 2)); // ending index is exclusive

*/
        System.out.printf("%25d  %s",10,"Surinder");
        System.out.println();
        System.out.printf("%s","Surinder");

    }
}
