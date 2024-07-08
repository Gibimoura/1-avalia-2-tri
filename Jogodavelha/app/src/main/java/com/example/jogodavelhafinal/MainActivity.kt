package com.example.jogodavelhafinal

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.jogodavelhafinal.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

 private lateinit var binding: ActivityMainBinding
//Seleção de modo de jogo
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

       val jogador = binding.buttonjogador
       val pc = binding.buttonpc


    jogador.setOnClickListener{
        val intent = Intent(this, jogador::class.java)
        startActivity(intent)
        finish()
    }

    pc.setOnClickListener {
        val intent = Intent(this, jogador::class.java)
        startActivity(intent)
        finish()
    }

    }
}