package com.habittracker.rootreflect.habit


import androidx.compose.runtime.mutableStateListOf


// This contains all the data that the UI displays
data class HabitState(

    // string that will be displayed by the edit window
    val editString: String = "",
    // int that will be displayed by the edit window
    val editFreq: Int = 1,

    val editDisplayHabit: DisplayHabit = DisplayHabit(),

    val editDays: String = "",

    // list of all the habits that will be displayed
    val displayHabits: MutableList<DisplayHabit> = mutableStateListOf(),

    //val date2: LocalDate = LocalDate.now().plusDays(1),
    // temp

    val selectedMood: MoodType? = null,
    )