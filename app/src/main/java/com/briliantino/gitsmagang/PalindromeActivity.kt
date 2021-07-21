package com.briliantino.gitsmagang

import android.graphics.Typeface
import android.icu.lang.UProperty.INT_START
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableStringBuilder
import android.text.style.StyleSpan
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.text.bold
import com.briliantino.gitsmagang.databinding.ActivityPalindromeBinding


class PalindromeActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding : ActivityPalindromeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPalindromeBinding.inflate(layoutInflater)
        setContentView(binding.root)


        title = resources.getString(R.string.txt_palindrome)
        binding.btnSubmit.setOnClickListener(this)
    }

    private fun reverse(str: String): String {
        val chars = CharArray(str.length)
        str.indices.forEach { chars[str.length - it - 1] = str[it] }
        return String(chars)
    }

    private fun isPalindrome(str: String): Boolean {
        val reverseStr = reverse(str)
        return str.equals(reverseStr, ignoreCase = true)
    }

    override fun onClick(v: View?) {
        val str = binding.etWord.text.toString()
        when(v?.id){
            R.id.btnSubmit->
                if (isPalindrome(str)){
                    binding.tvResult.text = resources.getString(R.string.palindrome,str)
                }else{
                    binding.tvResult.text = resources.getString(R.string.not_palindrome,str)
                }

        }
    }
}