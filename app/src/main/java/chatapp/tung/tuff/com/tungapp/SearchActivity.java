package chatapp.tung.tuff.com.tungapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.HashMap;

import butterknife.Bind;
import butterknife.ButterKnife;
import chatapp.tung.tuff.com.tungapp.Adapter.SearchGridAdapter;

public class SearchActivity extends Activity {

    @Bind(R.id.grid)    GridView grid;

    ArrayList<HashMap<String, String>> matchesSubListArr = new ArrayList<HashMap<String, String>>();
    HashMap<String, String> hshSubListCategory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        ButterKnife.bind(this);

        hshSubListCategory = new HashMap<String, String>();
        hshSubListCategory.put("place_longitude", "");
        matchesSubListArr.add(hshSubListCategory);
        matchesSubListArr.add(hshSubListCategory);
        matchesSubListArr.add(hshSubListCategory);
        matchesSubListArr.add(hshSubListCategory);
        matchesSubListArr.add(hshSubListCategory);
        matchesSubListArr.add(hshSubListCategory);
        matchesSubListArr.add(hshSubListCategory);
        matchesSubListArr.add(hshSubListCategory);
        matchesSubListArr.add(hshSubListCategory);
        matchesSubListArr.add(hshSubListCategory);
        matchesSubListArr.add(hshSubListCategory);

        SearchGridAdapter gridadap = new SearchGridAdapter(this, matchesSubListArr);
        grid.setAdapter(gridadap);


    }


}
