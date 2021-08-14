package com.jaskirat.skinalert;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by User on 20-03-2018.
 */

public class AboutUc extends android.support.v4.app.Fragment implements View.OnClickListener
{
    ImageView jaskirat, jaskiratin;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.about,null);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        jaskirat = view.findViewById(R.id.jaskirat);
        
        jaskiratin = view.findViewById(R.id.jaskiratin);
        

        jaskirat.setOnClickListener(this);
       
        jaskiratin.setOnClickListener(this);
        
    }

    @Override
    public void onClick(View view){
        Intent i = new Intent(view.getContext(), WebViewActivity.class);
        switch(view.getId()){
            case R.id.jaskirat:{
                i.putExtra("link", "https://github.com/jaskirat111");
                break;
            }
            
            case R.id.jaskiratin:{
                i.putExtra("link", "https://www.linkedin.com/in/jaskirat409/");
                break;
            }
           
        }
        startActivity(i);
    }
}
