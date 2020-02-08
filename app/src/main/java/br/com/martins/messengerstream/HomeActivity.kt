package br.com.martins.messengerstream

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class HomeActivity : AppCompatActivity() {
    val streamerNew: StreamerNew? = null
    val streamerList = ArrayList<StreamerModel>()
    val streamerListHorizontal = ArrayList<StreamerNew>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onStart() {
        super.onStart()
        configRecyclerView()
        configRecyclerView2()
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
        recyclerview_streamers_ours.adapter = OurStreamersHomeAdapter(streamerList, context = this)


    }

    private fun configRecyclerView2() {

        streamerListHorizontal.add(StreamerNew((R.drawable.josesartori), "name"))
        streamerListHorizontal.add(StreamerNew((R.drawable.josesartori), "name"))
        streamerListHorizontal.add(StreamerNew((R.drawable.josesartori), "name"))
        streamerListHorizontal.add(StreamerNew((R.drawable.josesartori), "name"))
        streamerListHorizontal.add(StreamerNew((R.drawable.josesartori), "name"))
        streamerListHorizontal.add(StreamerNew((R.drawable.josesartori), "name"))
        streamerListHorizontal.add(StreamerNew((R.drawable.josesartori), "name"))
        recyclerview_streamers_live.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerview_streamers_live.adapter = NewStreamersAdapterHorizontal(streamerListHorizontal, context = this)


    }

}
