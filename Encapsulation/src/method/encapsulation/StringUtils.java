package method.encapsulation;

import java.util.StringJoiner;

/**
 * Here's a simple example of method encapsulation -- hiding complexity
 * inside of methods. Benefits: 
 *   - easier to understand (we only need to know the "what" not the "how")
 *   - changes propagate to all uses of the method (edits done in one place)
 *   - simplicity: not much code, easier to edit
 *   - Single Responsibility Principle: one job per method
 *   - Also note that this class has a Single Responsibility: to provide
 *     various useful string manipulation functions.
 * 
 * @author jlombardo
 */
public class StringUtils {
    
    // We could do this without a custom method (just use the body),
    // but the method makes it easier to use -- no need to think about
    // the delimiter used or how to get the word array
    public String[] getWordArray(String value) {
        return value.split(" ");
    }
    
    // Again, this custom method makes it easier to use
    public int getWordCount(String value) {
        return getWordArray(value).length;
    }
    
    // Here we encapsulate complexity into one, simple to use method that
    // can be reused anywhere. Put this in  your toolbox!
    public String toTitleCase(String value) {
        value = value.toUpperCase();
        
        // Notice we delegate this work to a helper method instead of
        // duplicating the code
        String[] words = getWordArray(value);
        
        String titleCaseString = "";
        StringJoiner sj = new StringJoiner(" ");
        for(String word : words) {
            word = word.substring(0, 1) + word.substring(1).toLowerCase();
            sj.add(word);
        }
        return sj.toString();
    }
    
    // Again we encapsulate complexity into one, simple to use method that
    // can be reused anywhere. Put this in  your toolbox!
    public String filter(String[] removeItems, String origValue) {
        for(String removalItem : removeItems) {
            if(origValue.indexOf(removalItem + " ") > -1) {
                origValue = origValue.replace(removalItem + " ", "");
            } else {
                origValue = origValue.replace(removalItem, "");
            }
        }
        return origValue;
    }
    
    // This should be here -- violates the Single Responsibility Principle.
    // Sometimes, however, we do this as a shortcut to teach some other
    // concept. But it's not the job of this class to start up the program.
    // You should have a separate "Startup" class.
    public static void main(String[] args) {
        StringUtils u = new StringUtils();
        
        // toTitleCase Test
        System.out.println("Case Change:");
        String s = "welcome to ADVANCED JAVA";
        s = u.toTitleCase(s);
        System.out.println(s + "\n");
        
        
        // filter Test
        String[] removeItems = {"poop","damn","hate"};
        String origValue = "I hate the damn poop that comes from horses";
        System.out.println("Unfiltered String: \n\t" + origValue);
        System.out.println("Word count before filtering ... " + u.getWordCount(origValue));
        s = u.filter(removeItems, origValue);
        System.out.println("\nFiltered String: \n\t" + s);
        System.out.println("Word count AFTER filtering ... " + u.getWordCount(s));
        
    }
}
