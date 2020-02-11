package com.enriquers.flagappkotlin.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.enriquers.flagappkotlin.domain.CountryUseCase
import com.enriquers.flagappkotlin.ui.model.Country

class ViewModelCountry(val countryUseCase: CountryUseCase): ViewModel() {

    private val listCountries = MutableLiveData<List<Country>>()

    fun setListCountries(listCountries:List<Country>){
        setListCountries(countryUseCase.getCountriesFromRegion("Europe"))
    }

    fun getListCountriesLiveData():LiveData<List<Country>>{
        return listCountries
    }
}