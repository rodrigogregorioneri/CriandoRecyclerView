package net.paulacr.recyclerviewexample.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;

import net.paulacr.recyclerviewexample.adapter.MeuAdapter;
import net.paulacr.recyclerviewexample.R;
import net.paulacr.recyclerviewexample.model.Humor;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recycler);

        /*
        Lista de itens
         */
        List<Humor> humors = new ArrayList<>();
        humors.add(new Humor(getResources().getString(R.string.happy), R.drawable.happy_icon));
        humors.add(new Humor(getResources().getString(R.string.angry), R.drawable.angry_icon));
        humors.add(new Humor(getResources().getString(R.string.laughing), R.drawable.laughing_icon));
        humors.add(new Humor(getResources().getString(R.string.shy), R.drawable.shy_icon));

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        MeuAdapter adapter = new MeuAdapter(humors);
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
