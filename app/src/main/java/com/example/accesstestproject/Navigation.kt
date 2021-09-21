package com.example.accesstestproject

import com.example.accesstestproject.ui.access.AccessFragment
import com.example.accesstestproject.ui.access.OperFragment
import com.example.accesstestproject.ui.main.MainFragment
import com.github.terrakok.cicerone.androidx.FragmentScreen
import java.util.*

object Screens {
    fun Main() = FragmentScreen { MainFragment() }
    fun Access() = FragmentScreen { AccessFragment() }
    fun Oper() = FragmentScreen(UUID.randomUUID().toString()) { OperFragment() }
}