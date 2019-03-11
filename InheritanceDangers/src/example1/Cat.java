package example1;

/**
 * This class inherits all the default behaviors (methods) from animal.
 * Nothing is overridden. Unfortunately this means that Cat objects will not
 * be able to speak, i.e., "[mute]". And one has to ask, do we always want this
 * displayed in a JOptionPane? Was the Cat author lazy, or just uninformed?
 * Was the Animal class documentation adequate? Were there too many methods in
 * the Animal class to be able to understand quickly? Obviously in this simple
 * example that is not the case, but in a real world project there is a good 
 * chance that these things will be true.
 */
public class Cat extends Animal {

}
