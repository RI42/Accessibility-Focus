package com.example.accesstestproject.ui.access

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.accesstestproject.App
import com.example.accesstestproject.Screens
import com.example.accesstestproject.databinding.AccessFragmentBinding
import com.google.android.material.tabs.TabLayoutMediator

class AccessFragment : Fragment() {

    private var binding: AccessFragmentBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = AccessFragmentBinding.inflate(inflater, container, false).also {
        binding = it
    }.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val sectionsPagerAdapter = SectionsPagerAdapter(this)
        binding?.apply {
            viewPager.adapter = sectionsPagerAdapter

            TabLayoutMediator(tabLayout, viewPager) { tab, pos ->
                tab.setText(TAB[pos].first)
            }.attach()

            toolbar.setNavigationOnClickListener { App.INSTANCE.router.exit() }

            button.setOnClickListener {
                App.INSTANCE.router.navigateTo(Screens.Oper())
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

}
