package com.anone8.shop.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.anone8.shop.data.Shop
import com.anone8.shop.databinding.ItemShopBinding

class ShopAdapter(
    private val shops: List<Shop>,
    private val onItemClick: (Shop) -> Unit
) : RecyclerView.Adapter<ShopAdapter.ShopViewHolder>() {

    inner class ShopViewHolder(private val binding: ItemShopBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(shop: Shop) {
            binding.apply {
                ivShopImage.setImageResource(shop.imageResId)
                tvShopTitle.text = shop.title
                tvShopOverview.text = shop.overview
                tvShopCategory.text = shop.category
                tvShopCompany.text = "By ${shop.company}"
                tvRegion.text = shop.region

                root.setOnClickListener {
                    onItemClick(shop)
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShopViewHolder {
        val binding = ItemShopBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return ShopViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ShopViewHolder, position: Int) {
        holder.bind(shops[position])
    }

    override fun getItemCount(): Int = shops.size
}