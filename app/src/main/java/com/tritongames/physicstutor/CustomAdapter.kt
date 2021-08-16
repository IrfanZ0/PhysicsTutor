package com.tritongames.physicstutor

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.RadioButton
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter (private val dataSet : List<ItemData>):RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view)
    {
       val itemNameRadioButton : RadioButton = view.findViewById((R.id.purchaseItem))
        val addToCartButton : Button = view.findViewById(R.id.addToCart)
        val itemDescription : TextView = view.findViewById(R.id.itemDescription)

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.purchase_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        dataSet[position].also { itemData -> holder.itemNameRadioButton.text = itemData.productName }
        dataSet[position].also {itemData -> holder.addToCartButton.isPressed = itemData.isClicked }
        dataSet[position].also {itemData -> holder.itemDescription.text = itemData.productDescription }
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }

}