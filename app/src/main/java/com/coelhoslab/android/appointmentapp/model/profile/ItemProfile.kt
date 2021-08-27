package com.coelhoslab.android.appointmentapp.model.profile

import com.coelhoslab.android.appointmentapp.util.enumarators.ProfileItemActionEnum

class ItemProfile(val itemTitle: String, val itemDescription: String?, val isClickable: Boolean, val action: ProfileItemActionEnum) {
}