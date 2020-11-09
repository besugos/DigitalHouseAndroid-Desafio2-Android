package com.besugos.desafio2dha

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.widget.Toolbar
import androidx.navigation.Navigation


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

        val navController = Navigation.findNavController(view)

        val btnRegister: Button = view.findViewById(R.id.btnRegisterLogin)

        btnRegister.setOnClickListener {
            navController.navigate(R.id.registerFragment)
        }

        val btnLogin: Button = view.findViewById(R.id.btnLoginLogin)

        btnLogin.setOnClickListener {
            navController.navigate(R.id.homeFragment)
        }
    }

}