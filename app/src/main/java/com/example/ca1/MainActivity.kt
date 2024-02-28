package com.example.ca1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RatingBar

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find view references
        val ratingBar1 = findViewById<RatingBar>(R.id.rating_bar1)
        val ratingBar2 = findViewById<RatingBar>(R.id.rating_bar2)
        val ratingBar3 = findViewById<RatingBar>(R.id.rating_bar3)
        val ratingBar4 = findViewById<RatingBar>(R.id.rating_bar4)
        val submit_button = findViewById<Button>(R.id.submit_button)
        val average_rating = findViewById<RatingBar>(R.id.average_rating_bar)
        average_rating.isFocusable = false
        average_rating.isClickable = false

        submit_button.setOnClickListener {
            val rating1 = ratingBar1.rating
            val rating2 = ratingBar2.rating
            val rating3 = ratingBar3.rating
            val rating4 = ratingBar4.rating

            val averageRating = (rating1 + rating2 + rating3 + rating4) / 4

            average_rating.rating = averageRating


        }
    }
}
