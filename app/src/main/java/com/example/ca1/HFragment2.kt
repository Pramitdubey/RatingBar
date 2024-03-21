package com.example.ca1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


class HFragment2 : Fragment() {
    lateinit var textos:TextView


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view:View=inflater.inflate(R.layout.fragment_h2,container,false)
        textos=view.findViewById(R.id.txtdisp)
        return view
    }
    fun change(txt: String){
        textos.text=txt
    }


}