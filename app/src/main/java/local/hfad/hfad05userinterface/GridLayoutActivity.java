package local.hfad.hfad05userinterface;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

public class GridLayoutActivity extends AppCompatActivity {

//    private Button button;

//    public Button getButton() {
//        return button;
//    }
//
//    public void setButton(Button button) {
//        this.button = button;
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_layout);

//        button = findViewById(R.id.button);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Log.i(this.getClass().getName(), "view.getId()=" + view.getId());
//            }
//        });

    }

    public void onClickSendMessage(View view) {
        EditText emailEditText = findViewById(R.id.message_edit_text);
        Toast.makeText(
                this,
                "emailEditText.isFocused()=" + emailEditText.isFocused(),
                Toast.LENGTH_SHORT
        ).show();

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        emailEditText.setText(String.valueOf(spinner.getSelectedItem()));
//        emailEditText.setText(spinner.getSelectedItem().toString()); // also works
    }

    public void onToggleButtonClicked(View view) {
        boolean isChecked = ((ToggleButton) view).isChecked();
        if (isChecked) {
            Toast.makeText(
                    this,
                    "toggleButton.isChecked() [should be true] = " + isChecked,
                    Toast.LENGTH_SHORT
            ).show();
        } else {
            Toast.makeText(
                    this,
                    "toggleButton.isChecked() [should be false] = " + isChecked,
                    Toast.LENGTH_SHORT
            ).show();
        }
    }

    public void onSwitchButtonClicked(View view) {
        boolean isChecked = ((Switch) view).isChecked();
        if (isChecked) {
            Toast.makeText(
                    this,
                    "switch.isChecked() [should be true] = " + isChecked,
                    Toast.LENGTH_SHORT
            ).show();
        } else {
            Toast.makeText(
                    this,
                    "switch.isChecked() [should be false] = " + isChecked,
                    Toast.LENGTH_SHORT
            ).show();
        }
    }


    public void onRadioButtonClicked(View view) {
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radio_group);
        int id = radioGroup.getCheckedRadioButtonId();
        Toast.makeText(this,
                        ((RadioButton) findViewById(id)).getText() + " with id = " + id,
                        Toast.LENGTH_SHORT)
                .show();
    }
}