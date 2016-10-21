package chatapp.tung.tuff.com.tungapp.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import chatapp.tung.tuff.com.tungapp.R;
import chatapp.tung.tuff.com.tungapp.SignInSignUp;
import chatapp.tung.tuff.com.tungapp.util.TypefaceTextView;


public class WelcomeFour extends Fragment {

    public WelcomeFour() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.welcome_slide4, container, false);

        TypefaceTextView tvSignIn = (TypefaceTextView)v.findViewById(R.id.tvSignIn);
        TypefaceTextView tvSignUp = (TypefaceTextView)v.findViewById(R.id.tvSignUp);
        TypefaceTextView tvSignFB = (TypefaceTextView)v.findViewById(R.id.tvSignFB);

        tvSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SignInSignUp.class);
                startActivity(intent);
                getActivity().finish();
            }
        });

        return v;
    }

}
