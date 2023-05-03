package com.example.jonathan.customlistviewnotes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var animalListView: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        animalListView = findViewById(R.id.animal_list_view)

        var animalList = arrayListOf<AnimalModel>()

        var animalNames = arrayOf(
            "Cow",
            "Horse",
            "Turtle",
            "Crow",
            "Pig",
            "Dog",
            "Fish",
            "Raccoon",
            "Snake",
            "Lizard"
        )

        var animalImages = intArrayOf(
            R.drawable.cow,
            R.drawable.horse,
            R.drawable.turtle,
            R.drawable.crow,
            R.drawable.pig,
            R.drawable.dog,
            R.drawable.fish,
            R.drawable.raccoon,
            R.drawable.snake,
            R.drawable.lizard
        )

        var animalMammal = arrayOf(
            true,
            true,
            true,
            false,
            true,
            true,
            false,
            true,
            false,
            false
        )

        var animalColor = arrayOf(
            "Black and white",
            "Brown",
            "Green",
            "Black",
            "Pink",
            "Tan",
            "Rainbow",
            "Brown and Grey",
            "Black",
            "Green"
        )

        for (i in animalNames.indices)
            animalList.add(
                AnimalModel(
                    animalNames[i],
                    animalImages[i],
                    animalMammal[i],
                    animalColor[i]
                )
            )


        animalListView.adapter = MyCustomFruitAdapter(this, R.layout.list_activity, animalList)

        animalListView.setOnItemClickListener { parent, view, index, id ->
            Toast.makeText(this, "You Selected: " + animalList.get(index).name, Toast.LENGTH_SHORT)
                .show()


        }
    }
}