package com.example.sqlite_nome;
import androidx.appcompat.app.AppCompatActivity;
import android.content.ClipData;
import android.os.Bundle;
import android.renderscript.Sampler;
import android.view.InputDevice;
import android.support.v4.app.RemoteActionCompatParcelizer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import android.os.Bundle;
public class MainActivity extends AppCompatActivity {
    private EditText Nome;
    private Button Salva;
    private Button Apri;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startActivity(new Intent(MainActivity.this, MainActivity2.class));
        Nome = findViewById(R.id.nome);
        Button Salva = findViewById(R.id.salva);
        Button Apri = findViewById(R.id.apri);
    }

    public void apriInfo(View view) {
        Intent intent = new Intent(this, InfoActivity.class);
        startActivity(intent);
    }
}
