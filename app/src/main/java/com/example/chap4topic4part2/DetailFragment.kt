package com.example.chap4topic4part2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_detail.*
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_home.textviewNama


class DetailFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var getUsername = arguments?.getString("datausername")
        var getthn = arguments?.getInt("datatahunlahir")
        textviewNama.text = "$getUsername"
        val umur = 2022 - getthn!!
        textviewdetailUmur.text = "umur anda"
        textviewtahun.text = umur.toString()
    }


}