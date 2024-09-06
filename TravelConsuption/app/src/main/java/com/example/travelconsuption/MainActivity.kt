package com.example.travelconsuption

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.travelconsuption.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.buttonCalculator.setOnClickListener(this)
    }

    override fun onClick(view: View) {

        if (view.id == R.id.button_Calculator) {
            calculator()
        }
    }


    private fun calculator() {
        val distance = binding.editDistance.text.toString().toFloat()
        val price = binding.editPrice.text.toString().toFloat()
        val autonomy = binding.editAutonomy.text.toString().toFloat()

        val totalValue = (price * distance) / autonomy
        Toast.makeText(this, String.format("R$ %.2f", totalValue), Toast.LENGTH_SHORT).show()


    }
}
