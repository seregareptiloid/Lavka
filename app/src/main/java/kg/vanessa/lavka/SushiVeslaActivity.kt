package kg.vanessa.lavka

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout

class SushiVeslaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sushi_vesla)

        val back = findViewById<LinearLayout>(R.id.back)

        back.setOnClickListener{
            startActivity(Intent(this,SushiActivity::class.java))
        }

        val zakaz = findViewById<LinearLayout>(R.id.zakaz)

        zakaz.setOnClickListener{
            startActivity(Intent(this,OrderingActivity::class.java))
        }

    }
}