package kg.vanessa.lavka

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout

class SushiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sushi)

        val back = findViewById<LinearLayout>(R.id.back)

        back.setOnClickListener{
            startActivity(Intent(this,MealsActivity::class.java))
        }

        val sushivesla = findViewById<ImageView>(R.id.sushivesla)

        sushivesla.setOnClickListener{
            startActivity(Intent(this,SushiVeslaActivity::class.java))
        }
    }
}