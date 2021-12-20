package kg.vanessa.lavka

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout

class MealsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meals)

        val back = findViewById<LinearLayout>(R.id.back)

        back.setOnClickListener{
            startActivity(Intent(this,MainPageActivity::class.java))
        }

        val sushi = findViewById<LinearLayout>(R.id.linearLayout21)

        sushi.setOnClickListener{
            startActivity(Intent(this,SushiActivity::class.java))
        }

    }
}