package com.popumovie.keyalive.ankokotlinapp

import android.annotation.SuppressLint
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk25.coroutines.onClick

class LayoutAnkoActivity : AppCompatActivity() {

    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        ViewAnkoMain().setContentView(this)

        }
        class  ViewAnkoMain : AnkoComponent<LayoutAnkoActivity> {
            @SuppressLint("ResourceType")
            override fun createView(ui: AnkoContext<LayoutAnkoActivity>)= with(ui) {
//                view grup
                        verticalLayout {
                            //            masukan view
                            var input= editText {
                                hint ="Input name"
                            }.lparams{
                                height = wrapContent
                                width = matchParent
                                padding=10
                                margin=40
                            }

                            button{
                                text = "tunyuk"
                                backgroundColor= Color.GRAY
                                onClick {

                                    if (input.text.isNotEmpty()){
                                        toast("${input.text}")
                                    }else{
                                        toast("Kosongan")
                                    }
                                }
                            }.lparams{
                                margin=40
                            }
//            relative layout
                            relativeLayout{
                                var text1 = textView{
                                    text="Haiiii"
                                    textSize =20f
                                    id = 1
                                }
                                button{
                                    text = "Hooouuu"
                                    backgroundColor= Color.MAGENTA

                                }.lparams{
                                    below(1)
                                }
                            }
//                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }
        }

    }
}
