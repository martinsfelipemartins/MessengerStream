package br.com.martins.messengerstream

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.martins.messengerstream.OurStreamersHomeAdapter.*
import kotlinx.android.synthetic.main.streamer_item.view.*

class OurStreamersHomeAdapter(var streamersList: List<StreamerModel>, var context: Context?) :
    RecyclerView.Adapter<ViewHolder>() {


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
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.streamer_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return streamersList.size
    }

    //recebe o viewholder e a posição da lista
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val streamers = streamersList[position]
        holder.bindView(streamers)
        }
}