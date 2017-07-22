package ajaymehta.hashset2collection;

import java.util.HashSet;

/**
 * Created by Avi Hacker on 7/17/2017.
 */

// our values are coming from Edit text ..so they are String values ...we dont need to ..take HashSet<Object> type or anything
    // sting will do ...the work..
public class Hashset {   // i deleted other methods from this file to make a ease for you to understand .

    // i am bit modifying this file according to my need..

    HashSet<String> hs = new HashSet();

    public void add(String element) {

        if (!hs.contains(element)) {
            hs.add(element);
        }

    }





    public StringBuilder print() {

        StringBuilder sb = new StringBuilder();  // every time use put in edit text ..it add it to StringBuilder..(means everytime stringBuilder returns it has a new list with the added elememnt..then why our TextView ..just print
        // one new list ..because ...textview override StringBuilder value. (we know textView doesnt append) everything u gives anything to textView ..it first erases its value then gets new value n print it.

        for(Object s : hs) {

            sb.append(s+"\n");
        }
        return sb;
    }
}
