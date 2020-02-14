package br.com.martins.messengerstream

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.streamer_item.view.*

class OurStreamersHomeAdapter(private val streamersList: List<StreamerModel>, private val context: Context?) :
    RecyclerView.Adapter<OurStreamersHomeAdapter.ViewHolder>() {


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {


        fun bindView(streamer: StreamerModel) {

            val profilePicture = itemView.image_view_profile_list
            val nameStreamer = itemView.name_streamer_list
            val followersNumber = itemView.number_followers_list

            profilePicture.setImageResource(streamer.picture)
            nameStreamer.text = streamer.name
            followersNumber.text = streamer.followers


        }

    }

    //retorna o item já setado pelo viewholder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OurStreamersHomeAdapter.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.streamer_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return streamersList.size
    }

    //recebe o viewholder e a posição da lista
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        }
}