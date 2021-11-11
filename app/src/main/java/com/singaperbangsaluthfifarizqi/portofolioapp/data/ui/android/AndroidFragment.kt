package com.singaperbangsaluthfifarizqi.portofolioapp.ui.android

import android.app.Dialog
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import android.widget.Toast
import androidx.browser.customtabs.CustomTabsIntent
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.singaperbangsaluthfifarizqi.portofolioapp.R
import com.singaperbangsaluthfifarizqi.portofolioapp.data.android.AndroidObject
import com.singaperbangsaluthfifarizqi.portofolioapp.databinding.FragmentAndroidBinding


private const val GITHUB_LINK = "https://www.dzakyhdr.my.id/"

class AndroidFragment : Fragment() {
    private var _binding: FragmentAndroidBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentAndroidBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val androidAdapter = AndroidAdapter()
        androidAdapter.onItemClicked = { selectedData ->
            Toast.makeText(requireContext(), selectedData.title, Toast.LENGTH_SHORT).show()
        }
        androidAdapter.setData(AndroidObject.listAppAndroid)

        with(binding.rvAndroid) {
            layoutManager = LinearLayoutManager(requireContext())
            setHasFixedSize(true)
            adapter = androidAdapter
        }
        binding.btnAndroid.text = getString(
            R.string.app_android_btn,
            AndroidObject.listAppAndroid.size.toString()
        )


        binding.txtDokumentasi.setOnClickListener {
            CustomTabsIntent.Builder().build()
                .launchUrl(requireContext(), Uri.parse(GITHUB_LINK))
        }


    }


}