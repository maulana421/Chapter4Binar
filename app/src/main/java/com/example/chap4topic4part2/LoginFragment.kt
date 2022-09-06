package com.example.chap4topic4part2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_login.*


class LoginFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnLogin.setOnClickListener {
            var dataUsername  = etUsername.text.toString()
//            var dataPassword = etPassword.text.toString()
            var bundl = Bundle()
            bundl.putString("datausername",dataUsername)
//            bundl.putString("datapassword",dataPassword)

            Toast.makeText(context, "Login Success", Toast.LENGTH_SHORT).show()
            Navigation.findNavController(view).navigate(R.id.action_loginFragment_to_homeFragment, bundl)

        }

        tvRegister.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_loginFragment_to_registerFragment)
        }
    }
}