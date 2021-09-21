package com.example.accesstestproject.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.accesstestproject.App
import com.example.accesstestproject.Screens
import com.example.accesstestproject.databinding.MainFragmentBinding

class MainFragment : Fragment() {

    private var binding: MainFragmentBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = MainFragmentBinding.inflate(inflater, container, false).also {
        binding = it
    }.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.apply {

            access.setOnClickListener {
                App.INSTANCE.router.navigateTo(Screens.Access())
            }
        }

    }


    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

}
