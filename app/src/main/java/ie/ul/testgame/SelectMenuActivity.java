package ie.ul.testgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class SelectMenuActivity extends AppCompatActivity implements  View.OnClickListener {


    public CheckBox Difficulty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_menu);

        Difficulty = findViewById(R.id.Difficulty);
    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.button3x3:
                boolean difficultyHard = false;
                if (Difficulty.isChecked())
                {
                    difficultyHard = true;
                }
                Intent intent2 = new Intent(this,MainActivity.class);
                intent2.putExtra("DifficultyHard",difficultyHard);
                startActivity(intent2);
                break;

            case R.id.button4x4:
                Intent intent3 = new Intent(this,Main2Activity.class);
                startActivity(intent3);
                break;
        }
    }
}
