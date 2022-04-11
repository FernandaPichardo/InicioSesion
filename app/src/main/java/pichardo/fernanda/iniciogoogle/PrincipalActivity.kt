package pichardo.fernanda.iniciogoogle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class PrincipalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)


        val bundle = intent.extras
        if(bundle != null){

            val tname:TextView = findViewById(R.id.tv_name)
            val temail:TextView = findViewById(R.id.tv_email)

            val nombre  =  bundle.getString("name")
            val email = bundle.getString("email")

            tname.setText(nombre)
            temail.setText(email)

        }

        val btnCerrar: Button = findViewById(R.id.btn_cerrar)

        btnCerrar.setOnClickListener{
            finish()
        }
    }
}