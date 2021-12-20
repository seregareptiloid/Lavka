package kg.vanessa.lavka

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lavka = findViewById<LinearLayout>(R.id.linearLayout)

        lavka.setOnClickListener{
            startActivity(Intent(this,MainActivity::class.java))
        }

    }
}