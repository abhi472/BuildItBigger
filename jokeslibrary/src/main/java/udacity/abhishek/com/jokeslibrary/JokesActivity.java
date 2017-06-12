package udacity.abhishek.com.jokeslibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


public class JokesActivity extends AppCompatActivity {

    TextView jokes;
    Bundle bundle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jokes);
        jokes = (TextView) findViewById(R.id.jokes);
        bundle = getIntent().getExtras();
        jokes.setText(bundle.getString("val"));
    }
}
