package com.example.ca1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class FragmentExample : AppCompatActivity(),OnButtonPressListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment_example)
    }

    override fun onButtonPressed(msg: String) {
        var obj:BlankFragment2=supportFragmentManager.findFragmentById(R.id.fragment2)
            as BlankFragment2
        obj.onFragmentInteraction(msg)
    }
}