package com.gdcpulwama.android.myandyapp2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.microsoft.appcenter.AppCenter;
import com.microsoft.appcenter.analytics.Analytics;
import com.microsoft.appcenter.crashes.Crashes;
import com.microsoft.appcenter.AppCenter; import com.microsoft.appcenter.analytics.Analytics; import com.microsoft.appcenter.crashes.Crashes;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppCenter.start(getApplication(), "cdf2eee4-483f-4eb3-bf80-97bfe8c0fe3e",
                Analytics.class, Crashes.class);
    }
}
