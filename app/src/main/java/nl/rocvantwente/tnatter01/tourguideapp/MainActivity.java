package nl.rocvantwente.tnatter01.tourguideapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openRestaurantList(View view) {
        Intent i = new Intent(this, RestaurantActivity.class);
        startActivity(i);
    }
    public void openGebeurtenissenList(View view) {
        Intent i = new Intent(this, GebeurtenissenActivity.class);
        startActivity(i);
    }
    public void openAttractiesList(View view) {
        Intent i = new Intent(this, AttractieActivity.class);
        startActivity(i);
    }
    public void openSportList(View view) {
        Intent i = new Intent(this, SportActivity.class);
        startActivity(i);
    }
}
