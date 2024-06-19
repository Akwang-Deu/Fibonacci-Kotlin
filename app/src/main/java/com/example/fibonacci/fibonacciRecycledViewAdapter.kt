package com.example.fibonacci

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FibonacciRecycled(var number: List<Int> ): RecyclerView.Adapter <NumbersViewHolder> (){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumbersViewHolder {
        val numberView = LayoutInflater.from(parent.context)
            .inflate(R.layout.fibonacci_sequence,parent,false)
        return NumbersViewHolder(numberView)

    }

    override fun onBindViewHolder(holder: NumbersViewHolder, position: Int) {
        holder.txNum.text = number[position].toString()

    }

    override fun getItemCount(): Int {
        return number.size

    }
}
 class NumbersViewHolder(numberView: View): RecyclerView.ViewHolder(numberView){
     var txNum = numberView.findViewById<TextView>(R.id.txNum)
 }