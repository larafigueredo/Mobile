package com.example.profileapp
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Inicializando componentes
        val profileImage = findViewById<ImageView>(R.id.profileImage)
        val nameText = findViewById<TextView>(R.id.nameText)
        val descriptionText = findViewById<TextView>(R.id.descriptionText)
        val currentJobText = findViewById<TextView>(R.id.currentJobText)
        val experienceLayout = findViewById<LinearLayout>(R.id.experienceLayout)
        nameText.text = "Loki Laufeyson"
        descriptionText.text = "Candidato à presidência dos Estados Unidos da América"
        currentJobText.text = "Nunca trabalhei formalmente"

        // Lista de experiências
        val experiencias = listOf(
            "Consultor na AVT",
            "Espião de Asgard",
            "Jardineiro em tempo integral"
        )
        profileImage.setOnClickListener {
            Toast.makeText(this, "Foto de perfil de Loki Laufeyson", Toast.LENGTH_SHORT).show()
        }


        // Adicionando experiências dinamicamente
        for (experiencia in experiencias) {
            val textView = TextView(this)
            textView.text = experiencia
            textView.textSize = 16f
            experienceLayout.addView(textView)
        }
    }
}