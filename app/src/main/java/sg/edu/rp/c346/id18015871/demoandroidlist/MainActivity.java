package sg.edu.rp.c346.id18015871.demoandroidlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvAnd;
    ArrayList<AndroidVersion> AndList;
    //ArrayAdapter<CustomAdapter> aaAnd;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvAnd=findViewById(R.id.listViewAndroidVer);

        AndList=new ArrayList<>();
        AndroidVersion item1 = new AndroidVersion("Pie", "-9.0");
        AndroidVersion item2 = new AndroidVersion("Oreo", "-8.0 -8.1");
        AndroidVersion item3 = new AndroidVersion("Nougat", "-7.0 -7.1.2");
        AndroidVersion item4 = new AndroidVersion("Marshmallow", "-6.0");
        AndroidVersion item5 = new AndroidVersion("Lollipop", "-5.0 -5.1.1");
        AndroidVersion item6 = new AndroidVersion("Kitkat", "-4.4 -4.4.4");
        AndroidVersion item7 = new AndroidVersion("Jelly Bean", "-4.1 -4.3.1");

        AndList.add(item1);
        AndList.add(item2);
        AndList.add(item3);
        AndList.add(item4);
        AndList.add(item5);
        AndList.add(item6);
        AndList.add(item7);

        adapter=new CustomAdapter(this,
                R.layout.row, AndList);
        lvAnd.setAdapter(adapter);

    }
}