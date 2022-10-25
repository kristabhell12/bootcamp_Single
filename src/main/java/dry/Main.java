package dry;

public class Main {
    public static void main(String[]arg){
        ClassA a = new ClassA();
        ClassB b = new ClassB();
        System.out.println("From class A");
        a.getData("2010/01/02");
        System.out.println("From class B");
        b.getData("2010/01/02");
    }
}
