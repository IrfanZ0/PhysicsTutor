package com.tritongames.physicstutor

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PhysicsTutorViewModel : ViewModel() {
    private val mSpinnerData : MutableLiveData<List<String>> by lazy {
        MutableLiveData<List<String>>().also{
            loadUsers()
        }
    }

    fun getUsers(): LiveData<List<String>> {
        mSpinnerData.value = loadUsers()
        return mSpinnerData
    }


    private fun loadUsers(): MutableList<String> {
        val students = mutableListOf<String>()
        students.add("Irfan")
        students.add("Afroz")
        students.add("Hannan")
        students.add("Amaan")
        students.add("Mannan")
        return students

    }


}