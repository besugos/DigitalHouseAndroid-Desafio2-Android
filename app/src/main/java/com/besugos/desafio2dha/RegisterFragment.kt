package com.besugos.desafio2dha

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.view.SupportActionModeWrapper
import androidx.appcompat.widget.Toolbar
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import androidx.navigation.Navigation




class RegisterFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_register, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val navController = Navigation.findNavController(view)

        val toolbar: Toolbar = view.findViewById(R.id.tbRegister)

        toolbar.setNavigationOnClickListener {
            navController.navigate(R.id.loginFragment)
        }

        view.findViewById<Button>(R.id.btnRegisterRegister).setOnClickListener {

            navController.navigate(R.id.loginFragment)
        }
    }


}