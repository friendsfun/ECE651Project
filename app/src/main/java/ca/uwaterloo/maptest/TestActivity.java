package ca.uwaterloo.maptest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.util.List;

public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        UserDBHandler db = new UserDBHandler(this);

        //Log.d("Insert: ", "Inserting ..");
        //db.addUserinfo(new Userinfo("ece651@uwaterloo.ca", "ece651"));
        Log.d("Deleting: ", "Deleting all users..");
        Userinfo userinfo1 = new Userinfo("steve@ece651.com", "s");
        db.deleteUser(userinfo1);
        Log.d("Reading: ", "Reading all users..");


        List<Userinfo> userinfoList = db.getAllUserInfos();

        for(Userinfo userinfo : userinfoList) {
            String log = "username: " + userinfo.getUsername()
                    + ", password: " + userinfo.getPassword();
            Log.d("All User Infos: ", log);
        }

    }

}
