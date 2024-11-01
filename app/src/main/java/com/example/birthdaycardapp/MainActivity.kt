package com.example.birthdaycardapp

import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.ListAdapter
import com.example.birthdaycardapp.databinding.CaculatorLinearlayoutFragBinding

class MainActivity : AppCompatActivity() {

    private var _binding: CaculatorLinearlayoutFragBinding? = null;

    val binding get() = _binding!!

    var num1: String = ""

    var num2: String = ""

    var preOperator: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = CaculatorLinearlayoutFragBinding.inflate(layoutInflater);
        setContentView(binding.root);
        initToolbar()
        initView()
    }

    override fun onStart() {
        super.onStart()
    }

    private fun initToolbar() {
        val toolBar = findViewById<Toolbar>(R.id.tool_bar)
        toolBar.title = "LifeCycle"
        toolBar.setTitleTextColor(this.getColor(R.color.white))
    }

    private fun initView() {
        binding.number0.setOnClickListener { onNumberClick(binding.number0.text.toString())}
        binding.number1.setOnClickListener {onNumberClick(binding.number1.text.toString())}
        binding.number2.setOnClickListener {onNumberClick(binding.number2.text.toString())}
        binding.number3.setOnClickListener {onNumberClick(binding.number3.text.toString())}
        binding.number4.setOnClickListener {onNumberClick(binding.number4.text.toString())}
        binding.number5.setOnClickListener {onNumberClick(binding.number5.text.toString())}
        binding.number6.setOnClickListener {onNumberClick(binding.number6.text.toString())}
        binding.number7.setOnClickListener {onNumberClick(binding.number7.text.toString())}
        binding.number8.setOnClickListener {onNumberClick(binding.number8.text.toString())}
        binding.number9.setOnClickListener {onNumberClick(binding.number9.text.toString())}
        binding.operatorPlus.setOnClickListener {onClickOperator(binding.operatorPlus.text.toString())}
        binding.operatorMinor.setOnClickListener {onClickOperator(binding.operatorMinor.text.toString())}
        binding.operatorMultiple.setOnClickListener {onClickOperator(binding.operatorMultiple.text.toString())}
        binding.operatorDivision.setOnClickListener {onClickOperator(binding.operatorDivision.text.toString())}
        binding.operatorEqual.setOnClickListener {onClickOperator(binding.operatorEqual.text.toString())}
        binding.clean.setOnClickListener { clean() }
    }
    private fun onNumberClick(number: String) {
        if (preOperator != "") {
            num2 += number
        } else {
            num1 += number
        }
        binding.screen.text = num1 + preOperator + num2
    }

    /*
        + so operate so (operate)
        +
        +

     */

    private fun onClickOperator(ope: String) {
        // ui : number1 + operator + number2 + operator + if (first operator ton tai)  -> number1 = ketqua, neu = hoac khac bang )
        if (preOperator == "") {
            preOperator = ope
        } else {
            calculate()
            preOperator = if (ope == "=") "" else ope
        }
        binding.screen.text = num1 + preOperator + num2
    }
    private fun calculate() {
        var numInt1 = num1.toInt()
        var numInt2 = num2.toInt()
        when (preOperator) {
            "+" -> {
                numInt1 = numInt1 + numInt2
            }
            "-" -> {
                numInt1 = numInt1 - numInt2
            }
            "x" -> {
                numInt1 = numInt1 * numInt2
            }
            "/" -> {
                numInt1 = numInt1 / numInt2
            }
        }
        num1 = numInt1.toString()
        num2 = ""
    }
    private fun clean() {
        num1 = ""
        num2 = ""
        preOperator = ""
        binding.screen.text = num1 + preOperator + num2
    }
}
class Adapter: BaseAdapter() {
    override fun getCount(): Int {
        TODO("Not yet implemented")
    }

    override fun getItem(p0: Int): Any {
        TODO("Not yet implemented")
    }

    override fun getItemId(p0: Int): Long {
        TODO("Not yet implemented")
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        TODO("Not yet implemented")
    }

}