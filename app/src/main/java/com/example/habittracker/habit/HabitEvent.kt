package com.example.habittracker.habit

import androidx.compose.runtime.MutableState
import com.example.habittracker.database.Habit
import com.example.habittracker.database.HabitCompletion


// defines events that can be triggered by the UI
sealed interface HabitEvent {
    // data class can take arguments, data object cannot
    // each is explained in HabitViewModel
    data object ModifyHabit: HabitEvent
    data class BoxChecked(val displayHabit: DisplayHabit, val index:Int): HabitEvent
    data class EditHabit(val displayHabit: MutableState<Habit>): HabitEvent
    data class UpDateEditString(val newString : String): HabitEvent
    data class UpDateEditFreq(val newFreq : String): HabitEvent
    data object CancelEdit: HabitEvent
    data class DeleteHabit(val displayHabit: DisplayHabit): HabitEvent
    data class ContextMenuVisibility(val displayHabit: DisplayHabit): HabitEvent
    data class incCompletion(val completion: HabitCompletion): HabitEvent
    data class decComletion(val completion: HabitCompletion): HabitEvent

    data object resetCompletion: HabitEvent
}