package xyz.devleen.calculadoradtb;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextClock;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    private EditText editTextNumber01;

    private EditText editTextNumber02;

    private TextView textViewResultado;

    private TextClock fechaActual;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        editTextNumber01 = findViewById(R.id.editTextNumber01);
        editTextNumber02 = findViewById(R.id.editTextNumber02);

        textViewResultado = findViewById(R.id.textViewResultado);


    }

    public void Suma(View view){

        double operacion = Double.parseDouble(editTextNumber01.getText().toString()) + Double.parseDouble(editTextNumber02.getText().toString());

        textViewResultado.setText(operacion + "");


    }

    public void Resta(View view){

        double operacion = Double.parseDouble(editTextNumber01.getText().toString()) - Double.parseDouble(editTextNumber02.getText().toString());

        textViewResultado.setText(operacion + "");


    }

    public void Multiplicacion(View view){

        double operacion = Double.parseDouble(editTextNumber01.getText().toString()) * Double.parseDouble(editTextNumber02.getText().toString());

        textViewResultado.setText(operacion + "");


    }

    public void Division(View view){

        double operacion = Double.parseDouble(editTextNumber01.getText().toString()) / Double.parseDouble(editTextNumber02.getText().toString());

        textViewResultado.setText(operacion + "");


    }





}