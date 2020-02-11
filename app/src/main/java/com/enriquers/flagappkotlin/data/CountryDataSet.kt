package com.enriquers.flagappkotlin.data

import com.enriquers.flagappkotlin.ui.model.Country

class CountryDataSet{

    fun getCountriesFromRegion(region: String): List<Country> {
        return listOf(
            Country("Spain", "Madrid", "Europe"),
            Country("Italy", "Rome", "Europe"),
            Country("USA", "Washington", "America"),
            Country("Egypt", "Cairo, El", "Africa"),
            Country("Japan", "Tokyo", "Asia"),
            Country("Australia", "Canberra", "Oceania")
        )
    }
}