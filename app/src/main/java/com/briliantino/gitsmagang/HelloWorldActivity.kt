package com.briliantino.gitsmagang

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.briliantino.gitsmagang.databinding.ActivityHelloWorldBinding

class HelloWorldActivity : AppCompatActivity(),View.OnClickListener {
    private lateinit var binding : ActivityHelloWorldBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHelloWorldBinding.inflate(layoutInflater)
        setContentView(binding.root)


        title = resources.getString(R.string.hello_world)

        binding.btnSubmit.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        val number = binding.etNumber.text.toString().toInt()
        when(v?.id){
            R.id.btnSubmit->{
                when {
                    number % 5 == 0 && number % 3 == 0 ->{
                        binding.tvResult.text = resources.getString(R.string.hello_world)
                    }
                    number % 3 == 0 -> {
                        binding.tvResult.text = resources.getString(R.string.hello)
                    }
                    number % 5 == 0 -> {
                        binding.tvResult.text = resources.getString(R.string.world)
                    }
                    else -> {
                        binding.tvResult.text = resources.getString(R.string.no_result)
                    }
                }
            }
        }
    }


}