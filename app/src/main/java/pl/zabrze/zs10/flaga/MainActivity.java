package pl.zabrze.zs10.flaga;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void dobry(View view) {
        Toast.makeText(this, "tego przycisku nie wybieraj", Toast.LENGTH_SHORT).show();
    }

    public void ukryj(View view) {
        view.setVisibility(View.INVISIBLE);
    }
}