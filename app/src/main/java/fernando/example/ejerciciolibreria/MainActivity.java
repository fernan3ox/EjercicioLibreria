package fernando.example.ejerciciolibreria;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.hardware.*;
import android.net.wifi.*;
import android.bluetooth.*;


import fernando.example.suma.Suma_class;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WifiManager wifi;
        Sensor sensor;
        BluetoothManager BM;


        Log.i("texto", Suma_class.resultado(10, 10)+"");


    }
}
