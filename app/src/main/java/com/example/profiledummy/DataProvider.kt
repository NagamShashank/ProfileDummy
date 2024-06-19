package com.example.profiledummy

class DataProvider {

    fun getData() : ArrayList<UserData>{

        val userdata :  ArrayList<UserData> =  ArrayList()

        val user = UserData(
            empName = "Shashank",
            subject = "Job Enquiry",
            description = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s",
            userImg = R.drawable.ic_launcher_background
        )

        val user1 = UserData(
            empName = "Shoeb",
            subject = "Job Enquiry",
            description = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s",
            userImg = R.drawable.ic_launcher_background
        )

        val user2 = UserData(
            empName = "Priyanka",
            subject = "Job Enquiry",
            description = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s",
            userImg = R.drawable.ic_launcher_background
        )

        val user3 = UserData(
            empName = "Rahul",
            subject = "Job Enquiry",
            description = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s",
            userImg = R.drawable.ic_launcher_background
        )

        val user4 = UserData(
            empName = "Rohit",
            subject = "Job Enquiry",
            description = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s",
            userImg = R.drawable.ic_launcher_background
        )

        val user5 = UserData(
            empName = "Jitesh",
            subject = "Job Enquiry",
            description = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s",
            userImg = R.drawable.ic_launcher_background
        )

        val user6 = UserData(
            empName = "Mujaffar",
            subject = "Job Enquiry",
            description = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s",
            userImg = R.drawable.ic_launcher_background
        )

        val user7 = UserData(
            empName = "Yash",
            subject = "Job Enquiry",
            description = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s",
            userImg = R.drawable.ic_launcher_background
        )

        val user8 = UserData(
            empName = "Mayur",
            subject = "Job Enquiry",
            description = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s",
            userImg = R.drawable.ic_launcher_background
        )

        val user9 = UserData(
            empName = "Sanket",
            subject = "Job Enquiry",
            description = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s",
            userImg = R.drawable.ic_launcher_background
        )

        val user10 = UserData(
            empName = "Tanmay",
            subject = "Job Enquiry",
            description = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s",
            userImg = R.drawable.ic_launcher_background
        )

        val user11 = UserData(
            empName = "Dipesh",
            subject = "Job Enquiry",
            description = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s",
            userImg = R.drawable.ic_launcher_background
        )


        userdata.add(user)
        userdata.add(user1)
        userdata.add(user2)
        userdata.add(user3)
        userdata.add(user4)
        userdata.add(user5)
        userdata.add(user6)
        userdata.add(user7)
        userdata.add(user8)
        userdata.add(user9)
        userdata.add(user10)
        userdata.add(user11)




        return userdata
    }

}