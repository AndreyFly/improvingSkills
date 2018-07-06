package package1;

public class Cat {
    private static int a = 0;
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
