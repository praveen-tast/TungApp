package chatapp.tung.tuff.com.tungapp;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;

import butterknife.Bind;
import butterknife.ButterKnife;
import chatapp.tung.tuff.com.tungapp.util.TypefaceTextView;

public class SelectGender extends Activity implements View.OnClickListener {

    @Bind(R.id.iv_back)
    ImageView iv_back;
    @Bind(R.id.tv_done)
    TypefaceTextView tv_done;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_gender);
        ButterKnife.bind(this);

        iv_back.setOnClickListener(this);
        tv_done.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v==iv_back){
            onBackPressed();
        }
        else if(v==tv_done){
            onBackPressed();
        }

    }

    @Override
    public void onBackPressed() {
        Intent in = new Intent(SelectGender.this, HomeActivity.class);
        startActivity(in);
        finish();
    }
}
