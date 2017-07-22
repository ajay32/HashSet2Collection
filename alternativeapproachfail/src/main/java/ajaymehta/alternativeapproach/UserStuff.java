package ajaymehta.alternativeapproach;

import java.io.Serializable;

/**
 * Created by Avi Hacker on 7/17/2017.
 */

//Todo ...fail fail fail ...i left the project in between..n i dont want to read it again...but i can tell you if you using a static method to get this class object in differnet classes its not gonna work
    // making a method static is usless ..if you want the same object..static method ..doesnt return the same object.
    // making an object static return the same object..

public class UserStuff {

    private String userStuff;


    public String getUserStuff() {
        return userStuff;
    }

    public void setUserStuff(String userStuff) {
        this.userStuff = userStuff;
    }


    // I am creating the object in the same class..why ? coz in this project  i need class of this object at in two file
    // 1. MainActivity. .. so that the value m getting from editText  i can set     object.setUserStuff(Value)
    //2. In Hashset file ...    hashSetObject.add(object.getUserStuff)   .. object means this class object..


    public static UserStuff myObject() {  // its return UserStuff type..

      UserStuff stuffObject = new UserStuff();

        return stuffObject;
    }


    // if you returning like this ...you have to cast (coz) it returning  (Object type) .. so casting will let know ..what type of object it is
 // ---->>>   UserStuff object = (UserStuff) UserStuff.myObject();  // like this in any class..
 /*   public static Object myObject() {

        UserStuff stuffObject = new UserStuff();

        return stuffObject;
    }*/

}
