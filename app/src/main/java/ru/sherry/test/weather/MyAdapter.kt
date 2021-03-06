package ru.sherry.test.weather

import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.weater_list.view.*

class MyAdapter(private val myDataset: Array<String>?) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

        // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder.
    // Each data item is just a string in this case that is shown in a TextView.

    class MyViewHolder(textView: View) : RecyclerView.ViewHolder(textView) {
        val weaterString = textView.weaterString

    }


    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdapter.MyViewHolder {
        // create a new view
        val textView = LayoutInflater.from(parent.context).inflate(R.layout.weater_list, parent, false) as View
        // set the view's size, margins, paddings and layout parameters
        //  ...
        return MyViewHolder(textView)
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        Log.i("TAG", "значение списка в адаптере= " + myDataset!![position])
        holder.weaterString.text = myDataset!![position]
    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() = myDataset!!.size
}