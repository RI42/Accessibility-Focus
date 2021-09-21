package com.example.accesstestproject.ui.access

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.accesstestproject.Adapter
import com.example.accesstestproject.App
import com.example.accesstestproject.Screens
import com.example.accesstestproject.databinding.FragmentOperBinding

class OperFragment : Fragment() {
    private var binding: FragmentOperBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = FragmentOperBinding.inflate(layoutInflater, container, false).also {
        binding = it
    }.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.apply {
            iconImageView.setOnClickListener {
                App.INSTANCE.router.replaceScreen(Screens.Oper())
            }
            val adapter = Adapter()
            adapter.submitList(
                listOf("start") +
                        List(10) { "msg ${it + 1}" }
                        + "end"
            )
            scroll.adapter = adapter

            toolbar.setNavigationOnClickListener { App.INSTANCE.router.exit() }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

}
