package ajaymehta.alternativeapproach;

import java.util.HashSet;

/**
 * Created by Avi Hacker on 7/17/2017.
 */


// I am again modifying the file to suit our need ..

public class Hashset {



    HashSet<String> hs = new HashSet();

    UserStuff object = UserStuff.myObject();

    public void add() {

        String element = object.getUserStuff();

        if (!hs.contains(element)) {
            hs.add(element);
        }

    }





    public StringBuilder print() {

        StringBuilder sb = new StringBuilder();

        for(Object s : hs) {

            sb.append(s+"\n");
        }
        return sb;
    }
}
