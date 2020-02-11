package com.enriquers.flagappkotlin.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.enriquers.flagappkotlin.R
import com.enriquers.flagappkotlin.domain.CountryUseCase
import com.enriquers.flagappkotlin.ui.model.Country
import com.enriquers.flagappkotlin.viewmodel.ViewModelCountry
import com.enriquers.flagappkotlin.viewmodel.ViewModelCountryFactory

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: ViewModelCountry

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupViewModelAndObserve()
    }

    private fun setupViewModelAndObserve() {
        //TODO: Diff between ViewModelProviders (deprecated?) and ViewModelProvider
        viewModel = ViewModelProviders.of(this, ViewModelCountryFactory(CountryUseCase())).get(ViewModelCountry::class.java)
        val countryObserver = Observer<List<Country>> {
            for ( country in it ) {
                Log.i("country", country.name)
            }
        }
        viewModel.getListCountriesLiveData().observe(this, countryObserver)
    }
}
