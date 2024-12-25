package com.example.coureseworkandroid

import android.R
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import com.example.coureseworkandroid.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity() {

    private var _binding: ActivityMainBinding? = null
    private val mBinding get() = _binding!!
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        //setContentView(R.layout.activity_registration)
        //setContentView(R.layout.fragment_main)
        //setContentView(R.layout.activity_main)
        setContentView(mBinding.root)
        //val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        //navController = navHostFragment.navController
        //NavigationUI.setupActionBarWithNavController(this, navController)


        //enableEdgeToEdge()
        //setContentView(R.layout.activity_main)
        /*ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets*/
        /*val url = "https://www.cian.ru/cat.php?deal_type=rent&engine_version=2"
        val document: Document = Jsoup.connect(url).get()
        val listenings = document.select(".cian-item")
        for (listening: Element in listenings){
            val title = listening.select(".c6e8ba").text()
            val price = listening.select(".c6e8ba").text()
            val link = listening.select("a").attr("href")
            println("Title:$title")
            println("Title:$price")
            println("Title:$link")
            println("")

        }*/
        }

    /*override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp() || super.onSupportNavigateUp()
    }*/
}