package kg.vanessa.lavka

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout

class MainPageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_page)

        val eda = findViewById<LinearLayout>(R.id.linearLayout2)

        eda.setOnClickListener{
            startActivity(Intent(this,MealsActivity::class.java))
        }

        val groceri = findViewById<LinearLayout>(R.id.groceri)

        groceri.setOnClickListener{
            startActivity(Intent(this,groceri::class.java))
        }
    }
}