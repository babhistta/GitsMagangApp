package com.briliantino.gitsmagang

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.briliantino.gitsmagang.databinding.ActivityReverseBinding
import java.lang.StringBuilder

class ReverseActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding : ActivityReverseBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityReverseBinding.inflate(layoutInflater)
        setContentView(binding.root)


        title = resources.getString(R.string.reverse_sentences)
        binding.btnSubmit.setOnClickListener(this)
    }

    private fun reverse(str: String): String {
        val chars = CharArray(str.length)
        str.indices.forEach { chars[str.length - it - 1] = str[it] }
        return String(chars)
    }

    override fun onClick(v: View?) {
        val str = binding.etSentences.text.toString()
        when(v?.id){
            R.id.btnSubmit-> binding.tvResult.text = reverse(str)
        }
    }
}