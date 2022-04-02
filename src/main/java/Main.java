public class Main {
    public static void main(String[] args) {
        Triangle triangle1=new Triangle(5,5,2);
        Triangle triangle2=new Triangle("5","5","5");
        System.out.println(triangle1.answer());
        System.out.println(triangle2.answer());

    }
}
