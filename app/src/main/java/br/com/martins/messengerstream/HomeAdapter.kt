package br.com.martins.messengerstream

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup

class HomeAdapter(private val streamerModel: List<StreamerModel> ): RecyclerView.Adapter<HomeAdapter.ViewHolder>() {




    class ViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {
        fun bindView (streamerModel: StreamerModel){

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): HomeAdapter.ViewHolder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItemCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onBindViewHolder(holder: HomeAdapter.ViewHolder?, position: Int) {val streamers = streamerModel[position]
        holder?.let {
            it.bindView(streamers)
        } }
}