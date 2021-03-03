package by.it.academy.test

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity()  {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun onClick(view: View){
        val intent = Intent(this, SecondActivity::class.java)
           startActivity(intent)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menu.add("Main screen")
        menu.add("Share screen")
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.title) {
            "Main screen" -> {
                val mainScreen = Intent(this, MainActivity::class.java)
                startActivity(mainScreen)
            }
            "Share screen" -> {
                val shareScreen = Intent(this, SecondActivity::class.java)
                shareScreen.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
                startActivity(shareScreen)
            }
            else -> return super.onOptionsItemSelected(item)
        }
        Toast.makeText(this, item.title, Toast.LENGTH_SHORT).show()
        return super.onOptionsItemSelected(item)
    }



}
