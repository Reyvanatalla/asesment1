package org.d3if0104.assesment1.screen

import androidx.lifecycle.ViewModel
import org.d3if0104.assesment1.model.TiketKereta

class MainViewModel : ViewModel() {
    val data = mutableListOf<TiketKereta>()

    fun addTiket(namaPembeli: String, hargaTiket: String, destinasi: String){
        val newTiket = TiketKereta(id = 1, namaPembeli = namaPembeli, harga = hargaTiket, destinasi = destinasi)
        data.add(0, newTiket)
    }
}