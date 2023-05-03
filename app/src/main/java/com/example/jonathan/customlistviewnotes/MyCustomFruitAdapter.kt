package com.example.jonathan.customlistviewnotes

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text

class MyCustomFruitAdapter(var cantext: Context,
                            var myResource: Int,
                            var AnimalItems: ArrayList<AnimalModel>):ArrayAdapter<AnimalModel>(cantext, myResource, AnimalItems)   {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflater = LayoutInflater.from(cantext)
        val animalView = layoutInflater.inflate(myResource, null)

        val name = animalView.findViewById<TextView>(R.id.animal_name)
        val image = animalView.findViewById<ImageView>(R.id.animal_image)
        val mammal = animalView.findViewById<TextView>(R.id.animal_mammal)
        val color = animalView.findViewById<TextView>(R.id.animal_color)

        name.text = AnimalItems[position].name
        mammal.text = "Is a mammal: " + AnimalItems[position].isMammal
        color.text = AnimalItems[position].color
        image.setImageResource(AnimalItems[position].image)


       return animalView
    }
}