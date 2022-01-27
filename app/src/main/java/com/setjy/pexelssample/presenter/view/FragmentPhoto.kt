package com.setjy.pexelssample.presenter.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.widget.addTextChangedListener
import by.kirich1409.viewbindingdelegate.viewBinding
import com.bumptech.glide.Glide
import com.setjy.pexelssample.R
import com.setjy.pexelssample.databinding.FragmentPhotoBinding
import com.setjy.pexelssample.presenter.base.BaseFragment
import com.setjy.pexelssample.presenter.presenter.PhotoPresenter


class FragmentPhoto : BaseFragment<PhotoView, PhotoPresenter>(), PhotoView {
    private val binding: FragmentPhotoBinding by viewBinding()

    override fun initPresenter() {
        presenter = PhotoPresenter()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_photo, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initSearch()
        presenter.thisView=this

    }

    override fun showPhoto(url: String, photographer: String) {
        setPhoto(url)
        binding.tvFragmentPhotographer.text = photographer
    }

    override fun showError(error: String) {
        Toast.makeText(context, "Error: $error", Toast.LENGTH_LONG).show()
    }

    private fun initSearch() {
        binding.etFragmentSearch.addTextChangedListener { word ->
            val query = word.toString().trim()
            presenter.getPhoto(query)
        }
    }

    private fun setPhoto(url: String) {
        Glide.with(requireContext())
            .load(url)
            .into(binding.ivFragmentPhoto)
    }
}
