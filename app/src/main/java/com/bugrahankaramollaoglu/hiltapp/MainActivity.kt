package com.bugrahankaramollaoglu.hiltapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    // Field Injection
    @Inject
    lateinit var erkinKoray: Musician

    @Inject
    lateinit var myClass: ClassExample

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*var gitar = Instrument()
        var morVeOtesi = Band()
        var harunTekin = Musician(gitar, morVeOtesi)
        harunTekin.sing()*/

        erkinKoray.sing()

        println(myClass.myFun())


    }
}


@AndroidEntryPoint
class FragmentEx() : Fragment() {
    @Inject
    lateinit var kirk: Musician
}