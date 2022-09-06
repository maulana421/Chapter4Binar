package com.example.chap4topic4part2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_login.*


class HomeFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var getUsername = arguments?.getString("datausername")
        textviewNama.text = getUsername

        ivProfile.setOnClickListener {
            val bun = Bundle()
            bun.putString("profile",arguments?.getString("datausername"))
            Navigation.findNavController(view).navigate(R.id.action_homeFragment_to_profilFragment,bun)
        }



        btnHitung.setOnClickListener {

            var datatahunlahir  = ettahunLahir.text.toString().toInt()
//            var dataPassword = etPassword.text.toString()
            var bundl = Bundle()
            bundl.putInt("datatahunlahir",datatahunlahir)
            bundl.putString("datausername",arguments?.getString("datausername"))
            Navigation.findNavController(view).navigate(R.id.action_homeFragment_to_detailFragment,bundl)
        }
    }


}