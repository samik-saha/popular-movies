package samik_saha.github.com.popularmovies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GridView gridView = (GridView) findViewById(R.id.gridview);
        PosterItemAdapter posterItemAdapter = new PosterItemAdapter(this,
                R.layout.gridview_item_poster);
        gridView.setAdapter(posterItemAdapter);
    }
}
