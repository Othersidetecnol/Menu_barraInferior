package com.example.menu_barrainferior.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.menu_barrainferior.databinding.FragmentHomeBinding

// Define a classe HomeFragment que herda de Fragment
class HomeFragment1 : Fragment() {

    // Variável privada para armazenar o binding
    private var _binding: FragmentHomeBinding? = null

    // Propriedade que só é válida entre onCreateView e onDestroyView
    private val binding get() = _binding!!

    // Método chamado para criar a visualização do fragmento
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Obtém uma instância do ViewModel associado a este fragmento
        val homeViewModel = ViewModelProvider(this).get(HomeViewModel::class.java)

        // Infla o layout do fragmento usando o binding
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        // Corrigindo o erro de digitação: bindind -> binding
        val textView: TextView = binding._text
        // Observa as mudanças no LiveData do ViewModel e atualiza o TextView
        homeViewModel.text.observe(viewLifecycleOwner) { text ->
            textView.text = text
        }

        // Retorna a visualização raiz do fragmento
        return root
    }

    // Método chamado quando a visualização do fragmento é destruída
    override fun onDestroyView() {
        super.onDestroyView()
        // Define o binding como nulo para evitar vazamentos de memória
        _binding = null
    }
}
