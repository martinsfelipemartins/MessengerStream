package br.com.martins.messengerstream

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.new_streamers_item.view.*

class NewStreamersAdapterHorizontal(private val streamersList: List<StreamerNew>, private val context: Context?) :
    RecyclerView.Adapter<NewStreamersAdapterHorizontal.ViewHolder>() {




    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {


        fun bindView(streamer: StreamerNew) {

            val profilePicture = itemView.image_view_profile_horizontal_list
            val nameStoriesProfile=itemView.name_stories_profile

            profilePicture.setImageResource(streamer.pictureHorizontal)
            nameStoriesProfile.text=streamer.nameStoriesProfile



        }

    }

    //retorna o item já setado pelo viewholder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewStreamersAdapterHorizontal.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.new_streamers_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return streamersList.size
    }

    //recebe o viewholder e a posição da lista
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val streamers = streamersList[position]
        holder?.let {
            it.bindView(streamers)
        } }
}