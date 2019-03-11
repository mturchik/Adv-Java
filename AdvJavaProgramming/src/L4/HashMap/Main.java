package L4.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String text = "After walking a long time and meeting no one, he became tired and stretched himself upon a high green knoll where the day's warmth had melted off the snow. It was a charming place to lie, and he soon fell asleep. While he slept, the sun heat upon him. It not only singed his bird-skin coat, but so shrivelled and shrunk and tightened it on the little boy's body as to wake him up. And then when he felt how the sun had seared the coat he was so proud of, and saw the mischief its fiery beams had played, he flew into a great passion. He vowed fearful things, and berated the sun in a terrible way for a little boy no higher than a man's knee. ";
        text = text.replace(",", " ").replace("."," ").trim();
        String[] words = text.split(" ");
        HashMap hm = new HashMap();
        for(String s : words){
            if(hm.containsKey(s)){
                hm.put(s, (Integer)hm.get(s) + 1);
            }else{
                hm.put(s, new Integer(1));
            }
        }
        Set set = hm.entrySet();
        Iterator i = set.iterator();
        while(i.hasNext()){
            Map.Entry me = (Map.Entry)i.next();
            System.out.println(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
    }

}
