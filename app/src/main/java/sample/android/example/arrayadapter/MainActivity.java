package sample.android.example.arrayadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private static final String[] text = {
            "ここに",
            "表示",
            "されている",
            "文字列を",
            "ArrayAdapter",
            "を使用",
            "して表示する",

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this,R.layout.list);

        ListView listView = findViewById(R.id.listView);

        //strに文字列配列のtextの内容を入れていく
        for ( String str : text){
            //arrayAdapterにstrの内容を入れていく
            arrayAdapter.add(str);
        }
        //adapterをListViewにセット
        listView.setAdapter(arrayAdapter);

        //itemがクリックされたときの処理
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
               // Toast.makeText(MainActivity.this,String.format(Locale.UK,"%sがタップされました",
                 //       text[i]),Toast.LENGTH_LONG).show();
                Toast.makeText(MainActivity.this,text[i]+"がタップされました",Toast.LENGTH_LONG).show();
            }
        });
    }
}
