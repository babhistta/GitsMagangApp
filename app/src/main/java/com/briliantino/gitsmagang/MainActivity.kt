package com.briliantino.gitsmagang

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.briliantino.gitsmagang.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnHWrld.setOnClickListener(this)
        binding.btnCnvrtTm.setOnClickListener(this)
        binding.btnEmail.setOnClickListener(this)
        binding.btnPlndrm.setOnClickListener(this)
        binding.btnReverse.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.btnHWrld ->{
                val moveIntent = Intent(this@MainActivity, HelloWorldActivity::class.java)
                startActivity(moveIntent)
            }
            R.id.btnCnvrtTm ->{
                val moveIntent = Intent(this@MainActivity, ConvertTimeActivity::class.java)
                startActivity(moveIntent)
            }
            R.id.btnEmail ->{
                val moveIntent = Intent(this@MainActivity, EmailActivity::class.java)
                startActivity(moveIntent)
            }
            R.id.btnPlndrm ->{
                val moveIntent = Intent(this@MainActivity, PalindromeActivity::class.java)
                startActivity(moveIntent)
            }
            R.id.btnReverse ->{
                val moveIntent = Intent(this@MainActivity, ReverseActivity::class.java)
                startActivity(moveIntent)
            }
        }
    }
}