package com.home.nachosdemo.viewmodel

import com.airbnb.epoxy.EpoxyController
import com.home.nachosdemo.model.PhoneDataFactory
import com.home.nachosdemo.model.data.PhoneData
import com.home.nachosdemo.model.epoxy.PhoneEpoxyModelWithHolder_

class PhoneEpoxyController : EpoxyController() {

    private val foodItems: List<PhoneData> = PhoneDataFactory.getPhoneDataList()
    private var id = 0

    override fun buildModels() = foodItems.forEach {
        PhoneEpoxyModelWithHolder_(it)
                .id(id++)
                .addTo(this)
    }
}