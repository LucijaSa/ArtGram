package com.example.artgram.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.artgram.R
import com.example.artgram.common.base.AbstractViewHolder
import com.example.artgram.common.base.BaseAdapter
import com.example.artgram.common.base.ItemClickListener
import com.example.artgram.data.Image
import com.example.artgram.databinding.LayoutImageItemBinding

class ImagesRecyclerAdapter(itemClickListener: ((Image, Int) -> Unit)? = null) :
    BaseAdapter<Image, ImagesViewHolder>(itemClickListener) {
    override val itemLayout: Int = R.layout.layout_image_item

    override fun createViewHolder(view: View): ImagesViewHolder {
        val layoutInflater = LayoutInflater.from(view.context)
        val binding = LayoutImageItemBinding.inflate(layoutInflater, view as ViewGroup?, false)
        return ImagesViewHolder(binding)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }
}

class ImagesViewHolder(view: View) : AbstractViewHolder<Image>(view) {

    lateinit var binding: LayoutImageItemBinding

    constructor(binding: LayoutImageItemBinding) : this(binding.root) {
        this.binding = binding
    }


    override fun bind(model: Image, position: Int, listener: ItemClickListener<Image>) {
        binding.image = model
        binding.executePendingBindings()

        binding.llImageLayout.setOnClickListener {
            listener?.invoke(model, position)
        }

    }
}
