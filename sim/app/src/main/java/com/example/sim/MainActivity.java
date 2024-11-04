package com.example.sim;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements SensorEventListener {

    SensorManager mSersorManage;
    TextView textView;
    Sensor mSensor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        mSersorManage = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        mSensor = mSersorManage.getDefaultSensor(Sensor.TYPE_LIGHT);
        mSersorManage.registerListener(this, mSensor, SensorManager.SENSOR_DELAY_NORMAL);
        textView=findViewById(R.id.textView);
    }

    @Override
    public void onSensorChanged(SensorEvent event) {

        float dadoSensor= event.values[0];
        textView.setText(Float.toString(dadoSensor));
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }
}