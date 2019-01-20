package com.usc.zsurani.luggageplease;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.graphics.Typeface;
import android.widget.TextView;

public class MainActivity extends Activity {

//    Button getLocationBtn;
//    TextView locationText;
//
//    LocationManager locationManager;

    TextView tv1;
    Typeface tf1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        tv1 = (TextView) findViewById(R.id.textView3);
        tf1 = Typeface.createFromAsset(getAssets(), "ADAM.CG PRO.otf");
        tv1.setTypeface(tf1);

        Thread timerThread = new Thread(){
            public void run(){
                try{
                    sleep(1000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }finally{
                    Intent intent = new Intent(MainActivity.this,ToolActivity.class);
                    startActivity(intent);
                }
            }
        };
        timerThread.start();

//        getLocationBtn = (Button)findViewById(R.id.getLocationBtn);
//        locationText = (TextView)findViewById(R.id.locationText);
//
//
//        if (ContextCompat.checkSelfPermission(getApplicationContext(), android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(getApplicationContext(), android.Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
//            ActivityCompat.requestPermissions(this, new String[]{android.Manifest.permission.ACCESS_FINE_LOCATION, android.Manifest.permission.ACCESS_COARSE_LOCATION}, 101);
//        }
//
//        getLocationBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.d("myTag", "bye");
//
//                getLocation();
//
//            }
//        });
    }

//    void getLocation() {
//        try {
//            locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
//            locationManager.requestLocationUpdates(LocationManager.NETWORK_PROVIDER, 5000, 5, this);
//            Log.d("myTag", "hello");
//        }
//        catch(SecurityException e) {
//            e.printStackTrace();
//        }
//    }

//    @Override
//    public void onLocationChanged(Location location) {
//        locationText.setText("Latitude: " + location.getLatitude() + "\n Longitude: " + location.getLongitude());
//        Log.d("myTag", "Latitude: " + location.getLatitude() + "\n Longitude: " + location.getLongitude());
//
//        try {
//            Geocoder geocoder = new Geocoder(this, Locale.getDefault());
//            List<Address> addresses = geocoder.getFromLocation(location.getLatitude(), location.getLongitude(), 1);
//            locationText.setText(locationText.getText() + "\n"+addresses.get(0).getAddressLine(0)+", "+
//                    addresses.get(0).getAddressLine(1)+", "+addresses.get(0).getAddressLine(2));
//        } catch(Exception e) {
//        }
//    }

//    @Override
//    public void onProviderDisabled(String provider) {
//        Toast.makeText(MainActivity.this, "Please Enable GPS and Internet", Toast.LENGTH_SHORT).show();
//    }
//
//    @Override
//    public void onStatusChanged(String provider, int status, Bundle extras) {
//    }
//
//    @Override
//    public void onProviderEnabled(String provider) {
//    }
}