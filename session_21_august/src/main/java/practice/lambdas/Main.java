package practice.lambdas;

public class Main {

    public static void main(String[] args) {

        Testing t = ()->System.out.println("Hello");

    }

}

@FunctionalInterface
interface Testing{

    public abstract void set();
}



