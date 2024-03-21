package com.example.ca1

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


class BlankFragment2 : Fragment() {
    lateinit var textView: TextView
    lateinit var v1:View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
v1=inflater.inflate(R.layout.fragment_blank2,container,false)
    return v1
    }

    fun onFragmentInteraction(uri: String){
        Log.d("sudha",uri)
        textView=v1.findViewById(R.id.tv1)
        textView.setText(uri)
    }


}