package com.briliantino.gitsmagang

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.briliantino.gitsmagang.databinding.ActivityEmailBinding
import com.google.android.material.internal.ContextUtils.getActivity
import java.util.regex.Pattern

class EmailActivity : AppCompatActivity(),View.OnClickListener {
    private lateinit var binding : ActivityEmailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEmailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnSubmit.setOnClickListener(this)
        title = resources.getString(R.string.email)
    }

    private fun isValidEmail(str: String): Boolean{
        val emailAddress = Pattern.compile(
            "[a-z0-9\\+\\.\\_\\%\\-\\+]{1,20}" +
                    "\\@" +
                    "[a-z0-9]{1,10}" +
                    "\\." +
                    "[?:!id|!co\\.id]{1,5}"
        )
        return emailAddress.matcher(str).matches()
    }

    override fun onClick(v: View?) {
        val str = binding.etEmail.text.toString()
        when(v?.id){
            R.id.btnSubmit->
                if (isValidEmail(str)){
                    binding.tvResult.text = resources.getString(R.string.real_email,str)
                }else{
                    binding.tvResult.text = resources.getString(R.string.not_email,str)
                }

        }
    }


}