package com.popumovie.keyalive.ankokotlinapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_commons_anko.*
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk25.coroutines.onClick

class CommonsAnkoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_commons_anko)

//        tangkap nilai yang di kirim oleh mainactivity
        var a = intent.getIntExtra("a",0)
        var b = intent.getIntExtra("b",0)

//        toast pada anko
        toast(a.toString() + " " + b.toString())

        btnBrowser.onClick {
            browse("http://www.google.com")
        }

        btnShare.onClick {
            share("haii","kalifardy56@gmail.com")
        }

        btnCall.onClick {
            makeCall("081225071070")
        }
        btnSms.onClick {
            sendSMS("081225071070","haii")
        }
        btnEmail.onClick{
            email("kalifardy56@gmail.com","coba","hai")
        }
        btnAlert.onClick {
//            versi 1
//            alert("Alert with anko"){
//                noButton {
//                    toast("hoy")
//                }
//                yesButton {
//                    toast("hai")
//                }
//            }.show()
//            versi 2
            alert {
                title = "ini title"
                message="ini pesan"

                positiveButton("yes",onClicked = {
                    toast("ini button yes")
                })
                negativeButton("no",onClicked =  {toast("ini button no")})

                neutralPressed("ini neutral",onClicked = {toast("netral")})
            }.show()
        }
    }
}
