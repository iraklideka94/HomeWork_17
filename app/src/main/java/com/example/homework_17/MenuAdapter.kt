package com.example.homework_17

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil.ItemCallback
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.homework_17.databinding.MenuItemBinding

class MenuAdapter: ListAdapter<Items,MenuAdapter.MenuViewHolder>(Diff) {

    inner class MenuViewHolder(private val binding: MenuItemBinding): RecyclerView.ViewHolder(binding.root){
       fun bind(){
           val currentItem = getItem(adapterPosition)
           binding.apply {
             tvMenuTitle.text = currentItem.title
              ivMenuIcon.setImageResource(currentItem.icon)
               currentItem.badgeCount?.let {
                   tvBadge.text = it.toString()
                   tvBadge.background.setTint(currentItem.badgeColor)
                   tvBadge.visibility = View.VISIBLE
               }
           }
       }
    }

   companion object{
       val Diff = object: ItemCallback<Items>(){
           override fun areItemsTheSame(oldItem: Items, newItem: Items): Boolean {
               return oldItem.title == newItem.title
           }

           override fun areContentsTheSame(oldItem: Items, newItem: Items): Boolean {
               return oldItem == newItem
           }

       }
   }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuViewHolder {
        return MenuViewHolder(MenuItemBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: MenuViewHolder, position: Int) {
        holder.bind()
    }
}