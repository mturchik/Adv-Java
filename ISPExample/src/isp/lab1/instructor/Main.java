package isp.lab1.instructor;

public class Main {

    public static void main(String[] args) {
        Car herbie = new Car("1HGBH41JXMN112316", "Volkswagon", "Bug", 131921);
        Person speedRacer = new Person("Mach GoGoGo", 19);

        herbie.accelerate();
        System.out.println(herbie);
        herbie.start();
        herbie.accelerate();
        herbie.drive(34);
        herbie.accelerate();
        herbie.drive(431);
        herbie.accelerate();
        System.out.println(herbie);
        herbie.stopByBreaking();
        System.out.println(herbie);

        speedRacer.talk("The Mach Five is the most complex and ingenious car ever built; a tribute to my father's imagination, genius and technical skills!");

    }
}
