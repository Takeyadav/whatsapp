package com.example.whatsapp

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

private const val  N_tabs=3

class MyAdapter(fragmentManager: FragmentManager,lifecycle: Lifecycle):FragmentStateAdapter(fragmentManager,lifecycle)
{
    override fun getItemCount(): Int
    {
        return N_tabs
    }

    override fun createFragment(position: Int): Fragment
    {
        when(position)
        {
         0->return chats()
         1->return calls()
         2->return status()
        }
        return chats()
    }
}