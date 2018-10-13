package info.blogbasbas.listviewandrecycleview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_recyclerview.*

class RecyclerviewActivity : AppCompatActivity() {

    var dataBuahan = arrayOf("Buah 1", "Buah 2")
    var dataGambaran = arrayOf(R.drawable.abc_btn_check_material,
            R.drawable.abc_btn_check_material)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recyclerview)

        var customAdapter = CustomAdapter(this, dataBuahan, dataGambaran)
         var layoutLinear = LinearLayoutManager(this)
        rv_data.layoutManager = layoutLinear
        rv_data.adapter = customAdapter

        //https://github.com/basriumar12/KotlinListviewAndRecyclerview



    }
}
