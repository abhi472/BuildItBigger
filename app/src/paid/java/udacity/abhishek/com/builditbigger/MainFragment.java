package udacity.abhishek.com.builditbigger;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.MyJokesClass;

import udacity.abhishek.com.builditbigger.EndpointsAsyncTask;
import udacity.abhishek.com.builditbigger.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {


    MyJokesClass joke;

    public MainFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_main, container, false);

        Button button = (Button) root.findViewById(R.id.button_tell_joke);

        joke = new MyJokesClass();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*Intent intent = new Intent(getActivity().getApplicationContext(), MainJokeActivity.class);
                intent.putExtra("joke", joke.getJoke());*/
                Log.d("check", "onClick: wtf");

                new EndpointsAsyncTask().execute(getActivity().getApplicationContext());
                // startActivity(intent);
            }
        });


       /* AdView mAdView = (AdView) root.findViewById(R.id.adView);
        // Create an ad request. Check logcat output for the hashed device ID to
        // get test ads on a physical device. e.g.
        // "Use AdRequest.Builder.addTestDevice("ABCDEF012345") to get test ads on this device."
        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .build();
        mAdView.loadAd(adRequest);*/
        return root;
    }
}
