package isp.lab1;

public class Person implements Workable {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    @Override
    public void talk(String s) {
        System.out.println(s);
    }

    @Override
    public void run(int distance) {

    }

    @Override
    public void start() {

    }

    @Override
    public void drive(int distance) {

    }

    @Override
    public void stopByBreaking() {

    }

    @Override
    public void jump() {

    }

    @Override
    public void hike() {

    }

    @Override
    public void swim() {

    }

    @Override
    public void trip() {

    }
}
