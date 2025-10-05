package com.example.lab_week_05

import com.squareup.moshi.Json

data class ImageData(
    @Json(name = "url") val imageUrl: String,
    @Json(name = "breeds") val breeds: List<Breed>?
)

data class Breed(
    @Json(name = "name") val name: String
)
