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

    private fun isValid(): Boolean {
        return (binding.editDistance.text.toString() != ""
                && binding.editPrice.text.toString() != ""
                && binding.editAutonomy.text.toString() != ""
                && binding.editDistance.text.toString().toFloat() != 0f
                && binding.editPrice.text.toString().toFloat() != 0f
                && binding.editAutonomy.text.toString().toFloat() != 0f)
    }

    private fun calculator() {

        if (isValid()) {
            val distance = binding.editDistance.text.toString().toFloat()
            val price = binding.editPrice.text.toString().toFloat()
            val autonomy = binding.editAutonomy.text.toString().toFloat()
            val totalValue = (price * distance) / autonomy

            binding.textMoney.text = "R$ ${"%.2f".format(totalValue)}"
        } else {
            Toast.makeText(this, R.string.preenchaTodosOsCampos, Toast.LENGTH_SHORT).show()
        }

    }
}
