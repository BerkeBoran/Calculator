package com.example.calculator

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    fun topla(view: View){
        val sayi1=binding.editTextNumber2.text.toString().toDoubleOrNull()
        val sayi2=binding.editTextNumber3.text.toString().toDoubleOrNull()
        if (sayi1!=null && sayi2!=null)
        {
            val sonuc=sayi1+sayi2
            binding.textView2.text="Sonuç ${sonuc}"
        }
        else
            binding.textView2.text="Geçerli Değerler Giriniz!!"

    }
    fun cikar(view: View){
        val sayi1=binding.editTextNumber2.text.toString().toDoubleOrNull()
        val sayi2=binding.editTextNumber3.text.toString().toDoubleOrNull()
        if (sayi1!=null && sayi2!=null)
        {
            val sonuc=sayi1-sayi2
            binding.textView2.text="Sonuç ${sonuc}"
        }
        else
            binding.textView2.text="Geçerli Değerler Giriniz!!"
    }
    fun bol(view: View){
        val sayi1=binding.editTextNumber2.text.toString().toDoubleOrNull()
        val sayi2=binding.editTextNumber3.text.toString().toDoubleOrNull()
        if (sayi1!=null && sayi2!=null)
        {
            val sonuc=sayi1/sayi2
            binding.textView2.text="Sonuç ${sonuc}"
        }
        else
            binding.textView2.text="Geçerli Değerler Giriniz!!"
    }
    fun carp(view: View){
        val sayi1=binding.editTextNumber2.text.toString().toDoubleOrNull()
        val sayi2=binding.editTextNumber3.text.toString().toDoubleOrNull()
        if (sayi1!=null && sayi2!=null)
        {
            val sonuc=sayi1*sayi2
            binding.textView2.text="Sonuç ${sonuc}"
        }
        else
            binding.textView2.text="Geçerli Değerler Giriniz!!"
    }
    fun yuzde(view: View){
        val sayi1=binding.editTextNumber2.text.toString().toDoubleOrNull()
        val sayi2=binding.editTextNumber3.text.toString().toDoubleOrNull()
        if (sayi1!=null && sayi2!=null)
        {
            val sonuc=sayi1%sayi2
            binding.textView2.text="Sonuç ${sonuc}"
        }
        else
            binding.textView2.text="Geçerli Değerler Giriniz!!"
    }
    fun temizle(view: View){
       binding.editTextNumber2.text=null
        binding.editTextNumber3.text=null
        binding.textView2.text="Sonuç:"

    }
}