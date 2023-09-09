package br.edu.mouralacerda.ml23dm01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botao = findViewById<ImageButton>(R.id.btnProximo1)

        botao.setOnClickListener {

            val nome = findViewById<EditText>(R.id.edtNome).text.toString()
            val email = findViewById<EditText>(R.id.edtEmail).text.toString()

            val pacote = Bundle()
            pacote.putString("nome", nome)
            pacote.putString("email", email)

            val i = Intent(this, Tela2::class.java)

            i.putExtras(pacote)

            startActivity(i)

        }

    }
}