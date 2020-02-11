package com.enriquers.flagappkotlin.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.enriquers.flagappkotlin.domain.CountryUseCase

class ViewModelCountryFactory(val countriesUseCase: CountryUseCase): ViewModelProvider.Factory {
    override fun<T: ViewModel?> create(modelClass: Class<T>): T{
        return modelClass.getConstructor(CountryUseCase::class.java).newInstance(countriesUseCase)
    }
}