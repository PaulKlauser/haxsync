package org.codarama.haxsync.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

import org.codarama.haxsync.R;

public class WelcomeActivity extends Activity {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        //	Animation hyperspaceJump = AnimationUtils.loadAnimation(this, R.anim.hyperjump);
        ImageView image = (ImageView) findViewById(R.id.logo);
        //image.startAnimation(hyperspaceJump);
        image.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent nextIntent = new Intent(WelcomeActivity.this, WizardActivity.class);
                WelcomeActivity.this.startActivity(nextIntent);
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                WelcomeActivity.this.finish();
            }
        });

    }


}
