package br.com.lginfo.cartodevisitas.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.lginfo.cartodevisitas.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        insertListeners()
          }

    private fun insertListeners() = binding.btnAdd.setOnClickListener {
        val intent = Intent(this@MainActivity, AddCartao::class.java)
        startActivity(intent)
    }

}