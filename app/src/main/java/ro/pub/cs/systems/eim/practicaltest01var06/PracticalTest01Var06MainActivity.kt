package ro.pub.cs.systems.eim.practicaltest01var06

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import ro.pub.cs.systems.eim.practicaltest01var06.ui.theme.PracticalTest01Var06Theme
import java.util.concurrent.ThreadLocalRandom

class MainActivity : ComponentActivity() {
    private lateinit var buttonPlay: Button
    private lateinit var buttonRandom: Button
    private lateinit var checkbox1: CheckBox
    private lateinit var checkbox2: CheckBox
    private lateinit var checkbox3: CheckBox
    private lateinit var text1: EditText
    private lateinit var text2: EditText
    private lateinit var text3: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_practical_test01_var06_main)
        buttonPlay=findViewById<Button>(R.id.buttonPlay)
        buttonRandom=findViewById<Button>(R.id.buttonRandom)

        checkbox1=findViewById<CheckBox>(R.id.checkbox1)
        checkbox2=findViewById<CheckBox>(R.id.checkbox2)
        checkbox3=findViewById<CheckBox>(R.id.checkbox3)

        text1=findViewById<EditText>(R.id.number1)
        text2=findViewById<EditText>(R.id.number2)
        text3=findViewById<EditText>(R.id.number3)

        var random1=ThreadLocalRandom.current().nextInt(1, 3)
        var random2=ThreadLocalRandom.current().nextInt(1, 3)
        var random3=ThreadLocalRandom.current().nextInt(1, 3)
        buttonPlay.setOnClickListener {
            if(!checkbox1.isChecked)
                text1.setText(random1)
            if(!checkbox2.isChecked)
                text2.setText(random2)
            if(!checkbox3.isChecked)
                text3.setText(random3)
        }
        buttonRandom.setOnClickListener {
            random1=ThreadLocalRandom.current().nextInt(1, 3)
            random2=ThreadLocalRandom.current().nextInt(1, 3)
            random3=ThreadLocalRandom.current().nextInt(1, 3)
            Toast.makeText(this, "Valori pregatite: $random1, $random2, $random3", Toast.LENGTH_LONG).show()
        }

    }
}