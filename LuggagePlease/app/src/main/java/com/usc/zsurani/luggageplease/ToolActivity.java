package com.usc.zsurani.luggageplease;

import android.os.Bundle;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.github.nkzawa.socketio.client.IO;
import com.github.nkzawa.socketio.client.Socket;

import java.net.URISyntaxException;

public class ToolActivity extends AppCompatActivity {

    private Socket socket;
    private ImageButton findButton;
    private ImageButton buzzButton;
    private ImageButton infoButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tool);

        //call UI components  by id
        findButton = (ImageButton) findViewById(R.id.findButton);
        buzzButton = (ImageButton) findViewById(R.id.buzzButton);
        infoButton = (ImageButton) findViewById(R.id.infoButton);


        findButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    socket = IO.socket("http://luggage-please.herokuapp.com");
                    socket.connect();
                    socket.emit("message", "$app$" + "find");
                } catch (URISyntaxException e) {
                    e.printStackTrace();

                }
            }
        });

        buzzButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    socket = IO.socket("http://luggage-please.herokuapp.com");
                    socket.connect();
                    socket.emit("message", "$app$" + "buzz");
                } catch (URISyntaxException e) {
                    e.printStackTrace();

                }
            }
        });

        infoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    socket = IO.socket("http://luggage-please.herokuapp.com");
                    socket.connect();
                    socket.emit("message", "$app$" + "info");
                } catch (URISyntaxException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        getSupportActionBar().hide();
//        setContentView(R.layout.activity_tool);
//
//        findButton = (ImageButton)findViewById(R.id.findButton);
//        buzzButton = (ImageButton)findViewById(R.id.buzzButton);
//
//
//        if (ContextCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
//            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION}, 101);
//        }
//
//        findButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
////                try {
////                    socket = IO.socket("http://luggage-please.herokuapp.com");
////                    socket.connect();
////                    socket.emit("message", "$app$" + "brieee");
////
////                } catch (URISyntaxException e) {
////                    e.printStackTrace();
////
////                }
//            }
//        });
//    }

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
//
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
//
//    @Override
//    public void onProviderDisabled(String provider) {
//        Toast.makeText(ToolActivity.this, "Please Enable GPS and Internet", Toast.LENGTH_SHORT).show();
//    }
//
//    @Override
//    public void onStatusChanged(String provider, int status, Bundle extras) {
//    }
//
//    @Override
//    public void onProviderEnabled(String provider) {
//    }
