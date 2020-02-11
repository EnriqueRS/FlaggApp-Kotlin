package com.enriquers.flagappkotlin.domain

import com.enriquers.flagappkotlin.data.CountryDataSet
import com.enriquers.flagappkotlin.ui.model.Country

class CountryUseCase {
    private val countryDataSet = CountryDataSet()

    fun getCountriesFromRegion(region: String):List<Country>{
        return countryDataSet.getCountriesFromRegion(region)
    }
}