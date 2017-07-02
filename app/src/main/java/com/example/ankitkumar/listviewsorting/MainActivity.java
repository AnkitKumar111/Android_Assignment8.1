package com.example.ankitkumar.listviewsorting;

        import java.util.Arrays;
        import java.util.Collections;
        import java.util.List;

        import android.app.Activity;
        import android.os.Bundle;
        import android.view.View;
        import android.view.View.OnClickListener;
        import android.widget.ArrayAdapter;
        import android.widget.Button;
        import android.widget.ListView;

public class MainActivity extends Activity implements OnClickListener {

    ListView lv;
    ArrayAdapter<String> aa;
    Button asc, desc;
    String data[] = { "Jan", "Feb", "March", "April", "May", "June", "July" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Instantiation of UI Components
        lv = (ListView) findViewById(R.id.listView1);
        asc = (Button) findViewById(R.id.asc);
        desc = (Button) findViewById(R.id.desc);

        aa = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, data);
        lv.setAdapter(aa);

        asc.setOnClickListener(this);
        desc.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub

        if (v == asc) {
            Arrays.sort(data);
            aa.notifyDataSetChanged();

        }

        if (v == desc) {
            Arrays.sort(data);
            List<String> list = Arrays.asList(data);
            Collections.reverse(list);
            aa.notifyDataSetChanged();

        }

    }

}
