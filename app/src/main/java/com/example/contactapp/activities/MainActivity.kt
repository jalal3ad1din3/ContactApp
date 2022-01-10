package com.example.contactapp.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.contactapp.R
import com.example.contactapp.moduls.Adapter
import com.example.contactapp.moduls.Member
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val members = prepareMemberlist()
         refreshAdapter(members)

    }
fun prepareMemberlist():List<Member>{

    val members = ArrayList<Member>()

     for (i in 0..29){
         members.add(Member("Jalal ad Adin"+i,"Badri"+i))
     }
  return members
}
 fun refreshAdapter(member: List<Member>){

val adapter = Adapter(member)
     rv_first.adapter = adapter
 }
}