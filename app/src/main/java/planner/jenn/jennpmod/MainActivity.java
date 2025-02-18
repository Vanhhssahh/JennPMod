package planner.jenn.jennpmod;
//ESTUDIANTE: Jennifer Vanessa Organista Paz
//ID: 785957



import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button horarioButton = findViewById(R.id.horarioButton);
        Button recordatoriosButton = findViewById(R.id.recordatoriosButton);
        Button notasButton = findViewById(R.id.notasButton);
        Button climaButton = findViewById(R.id.climaButton);
        Button profileButton = findViewById(R.id.profileButton);







        horarioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, HorarioActivity.class);
                startActivity(intent);
            }
        });

        recordatoriosButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RecordatoriosActivity.class);
                startActivity(intent);
            }
        });

        notasButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, NotasActivity.class);
                startActivity(intent);
            }
        });

        climaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ClimaActivity.class);
                startActivity(intent);
            }
        });

        profileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
                startActivity(intent);
            }
        });
    }
}