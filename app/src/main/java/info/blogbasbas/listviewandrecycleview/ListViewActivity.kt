package info.blogbasbas.listviewandrecycleview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_list_view.*
import java.util.*

class ListViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)

        //buat objek array menampung angka
        var angka = arrayOf(1,2,3,4,5,6,7,10,90,20,40,50)
        //sort array
        Arrays.sort(angka)
        //buat objek adapter
        var adapterAngka = ArrayAdapter(ListViewActivity@this,
                android.R.layout.simple_list_item_1,angka)
        //dari adapter yang telah dibuat
        // di set ke id listview yang dari layout activity_listview
        listview_id.adapter = adapterAngka
        //event ketika si list di klik
        listview_id.setOnItemClickListener { adapterView, view, position, l ->

            Toast.makeText(this,"Ini list ke $position ", Toast.LENGTH_LONG).show()

        }


    }
}
