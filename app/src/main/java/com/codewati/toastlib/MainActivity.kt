package com.codewati.toastlib

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.codewati.customtoast.Toaster

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Toaster.shortToast(this, "Hello world!")
        //Toaster.longToast(this, "This is Codewati :)")
        Toaster.doneToast(this, "Codewati launches Successfully")
        //Toaster.alertToast(this, "Codewati launches Successfully")
       // Toaster.warningToast(this, "Codewati launches Successfully")
       // Toaster.loadingToast(this, "Codewati launches Successfully")
        //Toaster.infoToast(this, "Codewati launches Successfully")

        //val rootView: View = window.decorView.findViewById(android.R.id.content)

       // Toaster.doneSnackbar(rootView, "Codewati launches Successfully")
        //Toaster.alertSnackbar(rootView, "Codewati launches Successfully")
        //Toaster.warningSnackbar(rootView, "Codewati launches Successfully")
        //Toaster.infoSnackbar(rootView, "Codewati launches Successfully")



    }
}