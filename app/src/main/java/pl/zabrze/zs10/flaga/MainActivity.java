package pl.zabrze.zs10.flaga;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int licznik = 0;
    TextView textViewPolecenie;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewPolecenie = findViewById(R.id.textVievPolecenie);
    }

    public void dobry(View view) {
        Toast.makeText(this, R.string.ostrzezenie, Toast.LENGTH_SHORT).show();
    }

    public void ukryj(View view) {
        view.setVisibility(View.INVISIBLE);
        licznik++;
        if (licznik == 4){
            Toast.makeText(this, "To jest flaga polski", Toast.LENGTH_SHORT).show();
            textViewPolecenie.setText(R.string.podsumowanie);
        }
    }
}