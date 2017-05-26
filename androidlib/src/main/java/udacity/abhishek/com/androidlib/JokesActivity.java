package udacity.abhishek.com.androidlib;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokesActivity extends AppCompatActivity {
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jokes);
        TextView textView = (TextView) findViewById(R.id.joke);
        intent = getIntent();
        textView.setText(intent.getStringExtra("joke"));
    }
}
