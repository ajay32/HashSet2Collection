package ajaymehta.alternativeapproach;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.io.Serializable;

// Our task is to print user data ...but if user print the same thing again ... then we have to print toast ..ki dupicate stuff..cant accept
// and also if user is entring string ( take of it shoud be case insenstive )


public class MainActivity extends AppCompatActivity  {

    EditText enterSomething;
    TextView userStuff;

    Hashset hashset = new Hashset();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enterSomething =(EditText) findViewById(R.id.et_enter_something);
        userStuff = (TextView) findViewById(R.id.tv_user_stuff);
    }

    public void submit(View view) {

        String value =  enterSomething.getText().toString();


      UserStuff object = UserStuff.myObject(); //1st place to access object..
        object.setUserStuff(value);

        hashset.add();
        userStuff.setText(hashset.print());  // textView override old value n print new value ( so it prints new StringbUilder everytime (List)

        emptyEditBox();

    }

    public void emptyEditBox() {

        enterSomething.setText("");
    }


}
