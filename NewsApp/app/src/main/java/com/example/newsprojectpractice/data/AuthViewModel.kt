package com.example.newsprojectpractice.data

import android.app.ProgressDialog
import android.content.Context
import android.widget.Toast
import androidx.navigation.NavController
import com.example.newsprojectpractice.models.Users
import com.example.newsprojectpractice.navigation.ROUTE_HOME
import com.example.newsprojectpractice.navigation.ROUTE_LOGIN
import com.example.newsprojectpractice.navigation.ROUTE_SIGN_IN
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase

class AuthViewModel(var navController: NavController, var context: Context){
    var mAuth: FirebaseAuth
    var progress: ProgressDialog

    init {
        mAuth = FirebaseAuth.getInstance()
        progress = ProgressDialog(context)
        progress.setTitle("Loading")
        progress.setMessage("Please wait a moment ... ")
    }

    fun signup(email:String,pass:String,confpass:String){
        // progress.show()

        if (email.isBlank() || pass.isBlank() ||confpass.isBlank()){
            //progress.dismiss()
            Toast.makeText(context,"Please email and password cannot be blank", Toast.LENGTH_LONG).show()
            return
        }else if (pass != confpass){
            Toast.makeText(context,"Password do not match", Toast.LENGTH_LONG).show()
            return
        }else{
            mAuth.createUserWithEmailAndPassword(email,pass).addOnCompleteListener { it ->
                if (it.isSuccessful){
                    val userdata= Users(email,pass,mAuth.currentUser!!.uid)
                    val regRef=FirebaseDatabase.getInstance().getReference()
                        .child("Users/"+mAuth.currentUser!!.uid)
                    regRef.setValue(userdata).addOnCompleteListener {

                        if (it.isSuccessful){
                            Toast.makeText(context,"Sign up was successful", Toast.LENGTH_LONG).show()
                            navController.navigate(ROUTE_HOME)

                        }else{
                            Toast.makeText(context,"${it.exception!!.message}", Toast.LENGTH_LONG).show()
                            navController.navigate(ROUTE_LOGIN)
                        }
                    }
                }else{
                    navController.navigate(ROUTE_SIGN_IN)
                }

            } }

    }
    fun login(email: String,pass: String){
        progress.show()

        mAuth.signInWithEmailAndPassword(email,pass).addOnCompleteListener {
            progress.dismiss()
            if (it.isSuccessful){
                Toast.makeText(context,"Successfully Logged in", Toast.LENGTH_LONG).show()
                navController.navigate(ROUTE_HOME)
//                navController.navigate(ROUTE_REGISTER)TO TAKE YOU TO A DIIFFERNT PAGE
            }else{
                Toast.makeText(context,"${it.exception!!.message}", Toast.LENGTH_LONG).show()
                navController.navigate(ROUTE_LOGIN)
            }
        }

    }
    fun logout(){
        mAuth.signOut()
        navController.navigate(ROUTE_LOGIN)
    }
    fun isloggedin():Boolean{
        return mAuth.currentUser!=null
    }
}
