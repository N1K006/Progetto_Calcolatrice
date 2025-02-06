package com.example.calcolatrice;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.HashMap;


public class MainActivity extends AppCompatActivity
{
    HashMap<String, Button> bottone = new HashMap<>();
    TextView text;

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
        RecuperaOggetti();
    }

    public void RecuperaOggetti()
    {

        /*bottone.put("1", findViewById(R.id.b_1));
        bottone.put("2", findViewById(R.id.b_2));
        bottone.put("3", findViewById(R.id.b_3));
        bottone.put("4", findViewById(R.id.b_4));
        bottone.put("5", findViewById(R.id.b_5));
        bottone.put("6", findViewById(R.id.b_6));
        bottone.put("7", findViewById(R.id.b_7));
        bottone.put("8", findViewById(R.id.b_8));
        bottone.put("9", findViewById(R.id.b_9));
        bottone.put("0", findViewById(R.id.b_0));
        bottone.put("+", findViewById(R.id.b_somma));
        bottone.put("-", findViewById(R.id.b_sottrazione));
        bottone.put("*", findViewById(R.id.b_moltiplicazione));
        bottone.put("/", findViewById(R.id.b_divisione));
        bottone.put("ce", findViewById(R.id.b_CE));
        bottone.put("=", findViewById(R.id.b_uguale));*/
    }

    protected void b_Click(View v)
    {
        Button b = (Button) v;
        String t = b.getText().toString();
        if(t.equals(" "))
        {
            return;
        }
        else if (!t.equals(" "))
        {
            // do something
        }
        if(t.equals("ce"))
        {
            text.setText("");
            return;
        }
        text.append(t);
    }
}