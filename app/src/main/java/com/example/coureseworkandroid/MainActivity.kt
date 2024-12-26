package com.example.coureseworkandroid

import android.R
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import com.example.coureseworkandroid.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView
import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.nodes.Element

class MainActivity : AppCompatActivity() {

    private var _binding: ActivityMainBinding? = null
    private val mBinding get() = _binding!!
    private lateinit var navController: NavController
    data class RealEstateAd(val title: String, val price: String, val link: String)

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
        val url = "https://www.avito.ru/moskva/nedvizhimost" // Пример URL для Москвы
        val ads = parseRealEstateAds(url)

        for (ad in ads) {
            println("Title: ${ad.title}")
            println("Price: ${ad.price}")
            println("Link: ${ad.link}")
            println("-------------")
        }
    }

    fun parseRealEstateAds(url: String): List<RealEstateAd> {
        val adsList = mutableListOf<RealEstateAd>()
        val document: Document = Jsoup.connect(url).get()

        val adElements: List<Element> = document.select(".item")

        for (element in adElements) {
            val title = element.select(".title").text()
            val price = element.select(".price").text()
            val link = element.select("a").attr("href")

            adsList.add(RealEstateAd(title, price, link))
        }

        return adsList
        }

    /*override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp() || super.onSupportNavigateUp()
    }*/
}