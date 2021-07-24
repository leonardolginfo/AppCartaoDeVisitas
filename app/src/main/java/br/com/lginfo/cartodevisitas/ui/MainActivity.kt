package br.com.lginfo.cartodevisitas.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.lginfo.cartodevisitas.R
import br.com.lginfo.cartodevisitas.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val bindig by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(bindig.root)
    }
}