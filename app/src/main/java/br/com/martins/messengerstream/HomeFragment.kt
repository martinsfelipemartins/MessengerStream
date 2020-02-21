package br.com.martins.messengerstream


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.*
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {
    val streamerNew: StreamerNew? = null
    var streamerList = ArrayList<StreamerModel>()
    private val streamerListHorizontal = ArrayList<StreamerNew>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        setHasOptionsMenu(true)

        configRecyclerView()
        configRecyclerViewHorizontal()
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)


    }




    private fun configRecyclerView() {
        streamerList.add(StreamerModel((R.drawable.josesartori), "Jukera", "123k"))
        streamerList.add(StreamerModel((R.drawable.josesartori), "Jukera", "123k"))
        streamerList.add(StreamerModel((R.drawable.josesartori), "Jukera", "123k"))
        streamerList.add(StreamerModel((R.drawable.josesartori), "Jukera", "123k"))
        streamerList.add(StreamerModel((R.drawable.josesartori), "Jukera", "123k"))
        streamerList.add(StreamerModel((R.drawable.josesartori), "Jukera", "123k"))
        streamerList.add(StreamerModel((R.drawable.josesartori), "Jukera", "123k"))
        recyclerview_streamers_ours.adapter = OurStreamersHomeAdapter(streamerList, context)
        recyclerview_streamers_ours.layoutManager = LinearLayoutManager(context)
        recyclerview_streamers_live_horizontal.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        recyclerview_streamers_live_horizontal.adapter = NewStreamersAdapterHorizontal(streamerListHorizontal, context)



    }

    private fun configRecyclerViewHorizontal() {

        streamerListHorizontal.add(StreamerNew((R.drawable.josesartori), "name"))
        streamerListHorizontal.add(StreamerNew((R.drawable.josesartori), "name"))
        streamerListHorizontal.add(StreamerNew((R.drawable.josesartori), "name"))
        streamerListHorizontal.add(StreamerNew((R.drawable.josesartori), "name"))
        streamerListHorizontal.add(StreamerNew((R.drawable.josesartori), "name"))
        streamerListHorizontal.add(StreamerNew((R.drawable.josesartori), "name"))
        streamerListHorizontal.add(StreamerNew((R.drawable.josesartori), "name"))
        recyclerview_streamers_live_horizontal.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        recyclerview_streamers_live_horizontal.adapter = NewStreamersAdapterHorizontal(streamerListHorizontal, context)


    }

}
