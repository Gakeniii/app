package com.example.newsprojectpractice.models

import android.provider.ContactsContract.CommonDataKinds.Email

class Users {
    var email: String = ""
    var pass: String = ""
    var userid: String = ""

    constructor(email:String, pass:String, userid:String){
        this.email=email
        this.pass=pass
        this.userid=pass
    }
    constructor()
}