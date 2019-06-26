package com.home.nachosdemo.model

import com.home.nachosdemo.model.data.PhoneData

object PhoneDataFactory {

    fun getPhoneDataList(): List<PhoneData> {
        return PhoneData.getPhoneDataList()
    }
}