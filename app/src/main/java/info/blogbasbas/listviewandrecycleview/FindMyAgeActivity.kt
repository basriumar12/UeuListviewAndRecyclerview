package info.blogbasbas.listviewandrecycleview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_find_my_age.*
import java.util.*

class FindMyAgeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_find_my_age)

        //fungsi
        hitungUmurSaya()
    }

    private fun hitungUmurSaya() {

        btnCountAge.setOnClickListener {
            //buat validasi
            if (edtAge.text.toString().isEmpty()){
                edtAge.setError("gak bisa kosong bro")

                Toast.makeText(this,"cant empty field",Toast.LENGTH_LONG).show()


            }else{

                var age = edtAge.text.toString().toInt()
                var currentYear = Calendar.getInstance().get(Calendar.YEAR)

                var hasil = currentYear - age
                tvShowAge.text = "${hasil.toString()}Years Old"

            }


        }

    }


}
