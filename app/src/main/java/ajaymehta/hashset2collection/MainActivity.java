package ajaymehta.hashset2collection;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.HashSet;

// Our task is to print user data ...but if user print the same thing again ... then we have to print toast ..ki dupicate stuff..cant accept
// and also if user is entring string ( take of it shoud be case insenstive )


public class MainActivity extends AppCompatActivity {

    EditText enterSomething;
    TextView userStuff;

    Hashset hashset = new Hashset();  // object of our created Hashset class..

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enterSomething =(EditText) findViewById(R.id.et_enter_something);
        userStuff = (TextView) findViewById(R.id.tv_user_stuff);
    }

    public void submit(View view) {

        String value =  enterSomething.getText().toString();

        // here we are directly passing the value...to Hashset class..
        // there is also better alternative way to pass data ( if if  you want to that data at so many places in the project or if you need that data again n again
        // or if you just send that data in all the place or single place or whatever ..
        // i just mean lets try to send data in a differnt way to Hashset class..cool ?? yea.. see i have created a Module in the same Project called Alternative Approach..

        hashset.add(value);
        userStuff.setText(hashset.print());

        emptyEditBox();

    }

    public void emptyEditBox() {

        enterSomething.setText("");
    }


}
