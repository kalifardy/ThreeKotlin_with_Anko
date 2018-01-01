package com.popumovie.keyalive.ankokotlinapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.intentFor
import org.jetbrains.anko.sdk25.coroutines.onClick
import org.jetbrains.anko.sdk25.coroutines.onLongClick

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCommons.onClick {
            startActivity(intentFor<CommonsAnkoActivity>
            //            pengganti put extra pada anko
            ("a" to 1, "b" to 3))


//            startActivity(Intent(this@MainActivity,CommonsAnkoActivity::class.java))
        }
        btnLayout.onClick {
            startActivity(intentFor<LayoutAnkoActivity>())
//            startActivity(Intent(this@MainActivity,LayoutAnkoActivity::class.java))

        }
    }
}
