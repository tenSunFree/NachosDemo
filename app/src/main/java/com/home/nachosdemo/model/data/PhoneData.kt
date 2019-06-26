package com.home.nachosdemo.model.data

data class PhoneData(
    val isShowLabel: Boolean = false, // 是否顯示標籤
    val labelName: String = "", // 標籤名稱
    val phoneModel: String = "", // 手機型號, 比如HTC 10
    val phoneDetail: String = "", // 手機細節, 比如@1.6GHz..等
    val userPhoneScore: Int = 7773, // 使用者的手機分數, 比如7773
    val phoneScore: Int = 7773 // 該手機的手機分數, 比如7773
){
    companion object {
        fun getPhoneDataList(): MutableList<PhoneData> {
            val homePageBrowseStoreDataList = mutableListOf<PhoneData>()
            homePageBrowseStoreDataList.add(
                PhoneData(
                    true,
                    "Compute Comparison",
                    "Your Device",
                    "HTC U11",
                    7773,
                    7773
                )
            )
            homePageBrowseStoreDataList.add(
                PhoneData(
                    true,
                    "HTC Compute Comparison",
                    "HTC 10",
                    "Qualcomm MSM8996 Snapdragon 820 @ 1.6 GHz",
                    7773,
                    6476
                )
            )
            homePageBrowseStoreDataList.add(
                PhoneData(
                    false,
                    "",
                    "HTC One M9",
                    "Qualcomm MSM8994 Snapdragon 810 @ 1.6 GHz",
                    7773,
                    3630
                )
            )
            homePageBrowseStoreDataList.add(
                PhoneData(
                    false,
                    "",
                    "HTC Nexus 9",
                    "NVIDIA Tegra K1 Denver @ 2.5 GHz",
                    7773,
                    3619
                )
            )
            homePageBrowseStoreDataList.add(
                PhoneData(
                    false,
                    "",
                    "HTC One (M8x)",
                    "Qualcomm MSM8974AB Snapdragon 801 @ 2.5 GHz",
                    7773,
                    2554
                )
            )
            homePageBrowseStoreDataList.add(
                PhoneData(
                    false,
                    "",
                    "HTC One M9",
                    "Qualcomm MSM8994 Snapdragon 810 @ 1.6 GHz",
                    7773,
                    3630
                )
            )
            homePageBrowseStoreDataList.add(
                PhoneData(
                    false,
                    "",
                    "HTC Nexus 9",
                    "NVIDIA Tegra K1 Denver @ 2.5 GHz",
                    7773,
                    3619
                )
            )
            homePageBrowseStoreDataList.add(
                PhoneData(
                    false,
                    "",
                    "HTC One (M8x)",
                    "Qualcomm MSM8974AB Snapdragon 801 @ 2.5 GHz",
                    7773,
                    2554
                )
            )
            homePageBrowseStoreDataList.add(
                PhoneData(
                    false,
                    "",
                    "HTC One M9",
                    "Qualcomm MSM8994 Snapdragon 810 @ 1.6 GHz",
                    7773,
                    3630
                )
            )
            homePageBrowseStoreDataList.add(
                PhoneData(
                    false,
                    "",
                    "HTC Nexus 9",
                    "NVIDIA Tegra K1 Denver @ 2.5 GHz",
                    7773,
                    3619
                )
            )
            homePageBrowseStoreDataList.add(
                PhoneData(
                    false,
                    "",
                    "HTC One (M8x)",
                    "Qualcomm MSM8974AB Snapdragon 801 @ 2.5 GHz",
                    7773,
                    2554
                )
            )
            return homePageBrowseStoreDataList
        }
    }
}