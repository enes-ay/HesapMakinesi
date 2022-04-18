package com.enesay.hesapmakinesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun btn_sayi_click(view: View){
        if (yeniOperator){
            sayiGöster.setText("")

        }
        else
            yeniOperator=false

                var btn_sec=view as Button
                var btn_tik_deger:String=sayiGöster.text.toString()
        when(btn_sec.id){
            button0.id->{
                btn_tik_deger+="0"
            }
            button1.id->{
                btn_tik_deger+="1"
            }
            button2.id->{
                btn_tik_deger+="2"
            }
            button3.id->{
                btn_tik_deger+="3"
            }
            button4.id->{
                btn_tik_deger+="4"
            }
            button5.id->{
                btn_tik_deger+="5"
            }
            button6.id->{
                btn_tik_deger+="6"
            }
            button7.id->{
                btn_tik_deger+="7"
            }
            button8.id->{
                btn_tik_deger+="8"
            }
            button9.id->{
                btn_tik_deger+="9"
            }
            buttonNokta.id->{
                btn_tik_deger+="."
            }
            buttonVirgül.id->{
                btn_tik_deger+=","
            }
            button_artı_eksi.id->
            {
                btn_tik_deger=btn_tik_deger+"-"+btn_tik_deger
            }
        }
        sayiGöster.setText(btn_tik_deger)


    }
    fun btn_AC(view: View){

        sayiGöster.setText("")

    }
    fun btn_yüzde(view: View){

        var sayi:Double=sayiGöster.text.toString().toDouble()/100
        sayiGöster.setText(sayi.toString())

    }

    var operator="*"
    var eskiSayi=""
    var yeniOperator=true

    //-----ARİTMETİK İŞLEMLER------

    fun btn_arithmetics(view: View){

        var btn_sec=view as Button

        when(btn_sec.id){
            buttonBölme.id->
            {
                operator="/"
            }
            buttonÇarpı.id->
            {
                operator="*"
            }
            buttonEksi.id->
            {
                operator="-"
            }
            buttonArtı.id->
            {
                operator="+"
            }


        }
        eskiSayi=sayiGöster.text.toString()
        yeniOperator=true

    }
    fun btn_equal(view: View){
        var yeniSayi=sayiGöster.text.toString()

        var sonucSayi:Double?=null
        when(operator){

            "/"->{
                sonucSayi=eskiSayi.toDouble()/yeniSayi.toDouble()
            }

            "*"->{
                sonucSayi=eskiSayi.toDouble()*yeniSayi.toDouble()
            }

            "+"->{
                sonucSayi=eskiSayi.toDouble()+yeniSayi.toDouble()
            }

            "-"->{
                sonucSayi=eskiSayi.toDouble()-yeniSayi.toDouble()
            }

        }
        sayiGöster.setText(sonucSayi.toString())
        yeniOperator=true
    }



}