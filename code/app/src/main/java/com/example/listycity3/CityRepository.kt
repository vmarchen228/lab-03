package com.example.listycity3

import androidx.compose.runtime.mutableStateListOf

class CityRepository {
    private val _cities = mutableStateListOf(

        City("Edmonton", "AB"),
        City("Vancouver", "BC"),
        City("Toronto", "ON")
    )
    fun addCity (city: City) {
        _cities.add(city)
    }
    fun updateCity (oldcity: City, updatedCity: City ){
        val index = _cities.indexOf(oldcity)
        if (index != -1 ) {
            _cities[index] = updatedCity
        }

    }


    val cities: List<City>
        get() = _cities
}