package com.briliantino.gitsmagang

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.briliantino.gitsmagang.databinding.ActivityConvertTimeBinding
import java.text.SimpleDateFormat
import java.util.*

class ConvertTimeActivity : AppCompatActivity() {
    private lateinit var binding : ActivityConvertTimeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityConvertTimeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val timestamp = Date()
        val dateString = timestamp.dateToString("hh:mm ")
        binding.tvResult.text = dateString

        title = resources.getString(R.string.convert_time)
    }

    private fun Date.dateToString(str: String): String {
        val dateFormatter = SimpleDateFormat(str, Locale.getDefault())
        return dateFormatter.format(this)
    }

}