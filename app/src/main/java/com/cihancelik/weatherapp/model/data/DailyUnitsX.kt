package com.cihancelik.weatherapp.model.data


import com.google.gson.annotations.SerializedName

data class DailyUnitsX(
    @SerializedName("temperature_2m_max")
    val temperature2mMax: String,
    @SerializedName("temperature_2m_min")
    val temperature2mMin: String,
    @SerializedName("time")
    val time: String,
    @SerializedName("weathercode")
    val weathercode: String
)