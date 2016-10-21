package chatapp.tung.tuff.com.tungapp.fragments;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rengwuxian.materialedittext.MaterialEditText;

import chatapp.tung.tuff.com.tungapp.R;
import chatapp.tung.tuff.com.tungapp.SelectGender;
import chatapp.tung.tuff.com.tungapp.util.TypefaceTextView;


public class SignInFragment extends Fragment {

    public SignInFragment() {
        // Required empty public constructor
    }
    Typeface tf;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        tf = Typeface.createFromAsset(getActivity().getAssets(), "Montserrat-Light.otf");

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v = inflater.inflate(R.layout.fragment_one, container, false);
        MaterialEditText met_email = (MaterialEditText)v.findViewById(R.id.met_email);
        TypefaceTextView tvSignIn = (TypefaceTextView)v.findViewById(R.id.tvSignIn);

        tvSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(), SelectGender.class);
                startActivity(in);
                getActivity().finish();
            }
        });

        met_email.setTypeface(tf);


        return v;
    }



}
