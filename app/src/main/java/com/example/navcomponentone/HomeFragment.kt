package com.example.navcomponentone

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.example.navcomponentone.databinding.FragmentHomeBinding

/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        /*
        * CATATAN *
        Menggunakan tanda kurung bisa "()" jika menggunakan "Navigation"
        navigasi tidak akan bekerja jika menggunakan kurung kurawal "{}"
        pada perintah object "Navigation.createNavigateOnClickListener()"
         */
        binding.btnCategory.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_homeFragment_to_categoryFragment)
        )

        binding.btnProfile.setOnClickListener {
            view.findNavController().navigate(R.id.action_homeFragment_to_profileActivity)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}