package com.example.client.utils

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.first

class DataStoreManager (val context: Context) {

    companion object {
        private val Context.dataStore: DataStore<Preferences> by preferencesDataStore(name = "dataStoreClient")
    }

    suspend fun saveValue(key: String, value: String) {
        val dataStoreKey = stringPreferencesKey(key)
        context.dataStore.edit {settings ->
            settings[dataStoreKey] = value
        }
    }

    suspend fun getValue(key: String): String? {
        val dataStoreKey = stringPreferencesKey(key)
        val preferences = context.dataStore.data.first()
        return preferences[dataStoreKey]
    }
}