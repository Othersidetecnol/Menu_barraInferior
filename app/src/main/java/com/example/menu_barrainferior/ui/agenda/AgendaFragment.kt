package com.example.menu_barrainferior.ui.agenda

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.menu_barrainferior.databinding.FragmentAgendaBinding

class AgendaFragment : Fragment() {

    private var _binding: FragmentAgendaBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val agendaViewModel =
            ViewModelProvider(this).get(AgendaViewModel::class.java)

        _binding = FragmentAgendaBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textAgenda
        agendaViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
