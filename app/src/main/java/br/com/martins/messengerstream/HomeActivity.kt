package br.com.martins.messengerstream

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)


     val fragmentHome=HomeFragment()
        replaceFragment(R.id.container_home,fragmentHome)

    }




    private fun replaceFragment(container:Int,fragment: Fragment) {

        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(container, fragment)
        transaction.addToBackStack(null)
        transaction.commit()

    }



}
