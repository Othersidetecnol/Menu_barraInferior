package com.example.menu_barrainferior.ui.infos

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.menu_barrainferior.databinding.FragmentInfosBinding

class InfosFragment : Fragment() {

    private var _binding: FragmentInfosBinding? = null

    // Esta propriedade é válida apenas entre onCreateView e onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val infosViewModel =
            ViewModelProvider(this).get(InfosViewModel::class.java)

        _binding = FragmentInfosBinding.inflate(inflater, container, false)
        val root: View = binding.root


        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
