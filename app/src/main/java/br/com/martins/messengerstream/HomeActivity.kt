package br.com.martins.messengerstream

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class HomeActivity : AppCompatActivity() {

    val streamerList = ArrayList<StreamerModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onStart() {
        super.onStart()
        configRecyclerView()
    }


    private fun configRecyclerView() {
        streamerList.add(StreamerModel((R.drawable.josesartori), "Jukera", "123k"))
        streamerList.add(StreamerModel((R.drawable.josesartori), "Jukera", "123k"))
        streamerList.add(StreamerModel((R.drawable.josesartori), "Jukera", "123k"))
        streamerList.add(StreamerModel((R.drawable.josesartori), "Jukera", "123k"))
        streamerList.add(StreamerModel((R.drawable.josesartori), "Jukera", "123k"))
        streamerList.add(StreamerModel((R.drawable.josesartori), "Jukera", "123k"))
        streamerList.add(StreamerModel((R.drawable.josesartori), "Jukera", "123k"))
        recyclerview_streamers_ours.layoutManager = LinearLayoutManager(this)
        recyclerview_streamers_ours.adapter = HomeAdapter(streamerList, context = this)


    }
}
