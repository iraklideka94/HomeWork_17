package com.example.homework_17

import android.graphics.Color

data class Items(
    val title: String,
    val icon: Int,
    val badgeCount: Int? = null,
    val badgeColor: Int = Color.RED,
){
    companion object{
        val menuList = listOf(
            Items("Dashboard",R.drawable.ic_baseline_dashboard_24),
            Items("Message",R.drawable.ic_baseline_chat_24,15),
            Items("Notification",R.drawable.ic_baseline_notifications_24,20),
            Items("Calendar",R.drawable.ic_baseline_calendar_month_24),
            Items("Statistic",R.drawable.ic_baseline_cast_24),
            Items("Settings",R.drawable.ic_baseline_settings_24)
        )
    }
}


