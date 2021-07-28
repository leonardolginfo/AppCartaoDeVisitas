package br.com.lginfo.cartodevisitas

import android.app.Application
import br.com.lginfo.cartodevisitas.data.AppDatabase
import br.com.lginfo.cartodevisitas.data.BusinessCardRepository
import kotlinx.coroutines.InternalCoroutinesApi

class App : Application() {

    @InternalCoroutinesApi
    val database by lazy { AppDatabase.getDatabase(this) }
    @InternalCoroutinesApi
    val repository by lazy { BusinessCardRepository(database.businessDao()) }
}