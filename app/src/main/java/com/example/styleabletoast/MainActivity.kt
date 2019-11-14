package com.example.styleabletoast

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle
import android.widget.Toast
import com.muddzdev.styleabletoastlibrary.StyleableToast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
// to remove action bar type following in style.xml
    //Theme.AppCompat.Light.NoActionBar
    // all the code which is related to our designing phase included in our style.xml file
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
     btn.setOnClickListener{
         StyleableToast.makeText(this,"Hello User!",R.style.exampleToast).show()

     }

    }
}
