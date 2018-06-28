package package1;

public class Cat {
    private static int a = 1;
    private String name;
    Cat (){
        name = "Cat" + a;
        a++;
        }

    @Override
    public String toString() {
        return name;
    }
}
