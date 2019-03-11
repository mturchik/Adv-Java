package example1;

/**
 * This class is the start class for example1. It's purpose is to use the other
 * classes in the example1 package to expose a problem with implementation
 * inheritance -- namely that what you inherit is not always well understood, 
 * unless you spend hours reading super class documentation. And it's not uncommon
 * to inherit hundreds or even thousands of methods. That's a lot of documentation!
 * 
 * So what do most people do? They just use a small portion of what they inherit, 
 * without change, or they override the original implementation. Well that sounds 
 * reasonable, doesn't it? Problem is both choices may produce problems.
 * 
 * If you don't override the speak() method declared in the Animal class, you
 * get the default behavior, which is to speak nothing at all ... [mute]!
 * 
 * If you do override the speak() method, you may fail to notice that the
 * original version used a property called 'spokenMessage' to speak something. So
 * now if your new overridden speak() method does not use that property, it will be
 * programmed to speak something that isn't consistent with the spokenMessage that
 * is stored as a state property. If that message consitency needs to be maintained, you are going
 * to have a probelem. Also, notice that in the Animal class version of speak(),
 * a JOptionPane is used to display what is spoken. But in the overridden 
 * versions (see Duck and Dog) the console is used. Does it matter? It might, 
 * depending on the type of GUI you might be using.
 * 
 * All of these problems could have been avoided by delcaring an abstract 
 * speak(String message) method that is documented as needing to copy
 * the message argument into the spokenMessage property. This would be
 * accomplished via a set of concrete methods: setSpokenMessage() and getSpokenMessage().
 * As you can see, implementation inheritance is not always the best choice.
 */
public class StartProgram {

    /**
     * @param args the command line arguments -- not used
     */
    public static void main(String[] args) {
        // Duck inherits from Animal
        Duck duck = new Duck();
//        // sends "quack" to the console; not consistent, but at least it quacks
        duck.speak();
//        // Is this really what the duck just said?
        System.out.println("The last thing the duck said is: " + duck.getSpokenMessage());
//
//        // MuteDog inherits from animal
        Animal mute = new MuteDog();
////        // Inherits default implementation of speak(), which in this case is appropriate.
////        // Or is it? What if I don't want output doing to a JOptionPane?
        mute.speak();
//
//        // Dog inherits from Animal. It suffers from the same problems that Duck does above.
        Animal dog = new Dog();
//        // sends "bark" to the console; not consistent, but at least it barks
        dog.speak();
//        // Is this really what the dog just said?
        System.out.println("The last thing the dog said is: " + dog.getSpokenMessage());
        
        // Cat extends animal.
//        Cat cat = new Cat();
//        // No override of speak(), so is this what we want our cat to say? Mute?
//        cat.speak();
        // Well, if the Cat is mute, then is appropriate. But what if it "meows"?
//        System.out.println("The last thing the cat said is: " + cat.getSpokenMessage());
        
    }

}
