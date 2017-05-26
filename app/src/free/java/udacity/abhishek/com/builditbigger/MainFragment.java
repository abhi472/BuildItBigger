package udacity.abhishek.com.builditbigger;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */

import android.widget.Button;

import com.example.MyJokesClass;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

import udacity.abhishek.com.builditbigger.EndpointsAsyncTask;
import udacity.abhishek.com.builditbigger.R;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainFragment extends Fragment {

    MyJokesClass joke;
    InterstitialAd interstitialAd;
    View root;

    public MainFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        root = inflater.inflate(R.layout.fragment_main, container, false);

        Button button = (Button) root.findViewById(R.id.button_tell_joke);
        interstitialAd = new InterstitialAd(getActivity().getApplicationContext());
        interstitialAd.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        interstitialAd.loadAd(new AdRequest.Builder().build());
        joke = new MyJokesClass();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*Intent intent = new Intent(getActivity().getApplicationContext(), MainJokeActivity.class);
                intent.putExtra("joke", joke.getJoke());*/
                if (interstitialAd.isLoaded()) {
                    interstitialAd.show();
                    new EndpointsAsyncTask().execute(getActivity().getApplicationContext());
                } else {
                    new EndpointsAsyncTask().execute(getActivity().getApplicationContext());
                }
                // startActivity(intent);
            }
        });

        interstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                requestAd();
                //new EndpointsAsyncTask().execute(getActivity().getApplicationContext());
            }
        });


        /*mAdView = (AdView) root.findViewById(R.id.adView);
        // Create an ad request. Check logcat output for the hashed device ID to
        // get test ads on a physical device. e.g.
        // "Use AdRequest.Builder.addTestDevice("ABCDEF012345") to get test ads on this device."
        requestAd();*/
        return root;
    }

    /*private void requestAd() {
        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .build();
        mAdView.loadAd(adRequest);
    }*/

    private void requestAd() {
        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .build();

        interstitialAd.loadAd(adRequest);
    }
}
