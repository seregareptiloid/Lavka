package kg.vanessa.lavka

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout

class GroceriesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_groceries)

        val narodniy = findViewById<LinearLayout>(R.id.linearLayout5)

        narodniy.setOnClickListener{
            startActivity(Intent(this,OrderActivity::class.java))
        }

        val back = findViewById<LinearLayout>(R.id.back)

        back.setOnClickListener{
            startActivity(Intent(this,MainPageActivity::class.java))
        }
    }
}