package java.com.example.quicknotes;


import static androidx.core.content.ContextCompat.startActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

import com.example.quicknotes.R;
import com.google.android.ads.mediationtestsuite.activities.HomeActivity;

public class SplashActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // Delay of 2 seconds before moving to HomeActivity
        new Handler().postDelayed(() -> {
            Intent intent = new Intent(SplashActivity.this, HomeActivity.class);
            startActivity(intent);
            finish();
        }, 2000); // 2 seconds delay
    }
}
