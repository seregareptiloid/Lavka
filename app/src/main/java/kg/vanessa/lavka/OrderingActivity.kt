package kg.vanessa.lavka

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout

class OrderingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ordering)

        val back = findViewById<LinearLayout>(R.id.back)

        back.setOnClickListener{
            startActivity(Intent(this,InfoActivity::class.java))
        }

        val zakaz = findViewById<LinearLayout>(R.id.zakaz)

        zakaz.setOnClickListener{
            startActivity(Intent(this,InfoActivity::class.java))
        }
    }
}