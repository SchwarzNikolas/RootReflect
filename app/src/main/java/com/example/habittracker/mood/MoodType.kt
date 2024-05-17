package com.example.habittracker.mood

enum class MoodType (val moodColor: Long) {
    BAD (0xFFFF0000),
    SO_SO (0xFFFFA500),
    OK (0xFFFFFF00),
    ALRIGHT (0xFF00FF00),
    GOOD (0xFF008000)
}