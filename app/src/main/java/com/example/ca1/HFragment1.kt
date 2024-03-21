package com.example.ca1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView

class HFragment1 : Fragment() {

    var AndroidOS= arrayOf(
        "Cupcake",
        "Donout",
        "Eclair",
        "Fryo"

    )

    lateinit var lv:ListView


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view:View=inflater.inflate(R.layout.fragment_h1,container,false)
        lv=view.findViewById(R.id.lst) as ListView
        val arrayAdapter=ArrayAdapter(requireActivity(),android.R.layout.simple_list_item_1,AndroidOS)
        lv.setAdapter(arrayAdapter)
        lv.setOnItemClickListener{
            adapterView,view,i,l->
            val txtfrag=parentFragmentManager.findFragmentById(R.id.fragment2)
                as HFragment2
            txtfrag.change("Android OS:- "+AndroidOS[i])
            lv.setSelector(R.color.purple)
        }
        return view
    }


}