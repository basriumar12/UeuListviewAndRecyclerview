package info.blogbasbas.listviewandrecycleview

import android.content.Intent
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //ke activity FindMyAge
        btn_find_my_age.setOnClickListener {
            //pindah activity
            var intent = Intent(this, FindMyAgeActivity::class.java)
            startActivity(intent)
        }
        //pindah ke listview activity
        btn_listview.setOnClickListener {
            //pindah activity
            var intent = Intent(this, ListViewActivity::class.java)
            startActivity(intent)
        }
        //pindah ke Recyclerview acitivity
        btn_recyclerview.setOnClickListener {
            //pindah activity
           aksesclass(RecyclerviewActivity::class.java)
        }

    }
        //method utk fungsi intent
    fun aksesclass(kelastujuan: Class<*>) {
        startActivity(Intent(this, kelastujuan))
    }

}
