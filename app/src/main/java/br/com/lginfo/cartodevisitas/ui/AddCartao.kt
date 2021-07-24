package br.com.lginfo.cartodevisitas.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.lginfo.cartodevisitas.databinding.ActivityAddCartaoBinding


class AddCartao : AppCompatActivity() {

    private val binding by lazy { ActivityAddCartaoBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        fecharTela()
    }

    private fun fecharTela(){
        binding.btnClose.setOnClickListener{
            finish()
        }

        binding.btnAddcartao.setOnClickListener {

        }
    }

}