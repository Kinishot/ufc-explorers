package com.tapioca.ufcexpedition

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import com.tapioca.ufcexpedition.fragment.HomeFragment
import com.tapioca.ufcexpedition.fragment.ProfileFragment
import com.tapioca.ufcexpedition.fragment.SearchFragment
import kotlinx.android.synthetic.main.activity_main.*

/**
 * Activity principal que vai conter os fragmentos do fluxo principal da aplicação.
 */
class MainActivity : AppCompatActivity() {

    // Definição do listener do menu de navegação inferior
    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) { // Quando clica na opção item, se o id for =
            R.id.navigation_home -> { // Home
                val home = HomeFragment.newInstance()
                replaceFragment(home, R.id.fragment_container)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_search -> { // Pesquisa
                val search = SearchFragment.newInstance()
                replaceFragment(search, R.id.fragment_container)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_profile -> { // Perfil
                val profile = ProfileFragment.newInstance()
                replaceFragment(profile, R.id.fragment_container)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_scan -> { // Scanner
                val scan = HomeFragment.newInstance()
                replaceFragment(scan, R.id.fragment_container)
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Toolbar superior
        setSupportActionBar(toolbar)

        // Setar o listener do navigation menu
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)

        // Primeiro abre o home
        val home = HomeFragment.newInstance()
        addFragment(home, R.id.fragment_container)
    }

    // Para usar quando for carregar os dados ao abrir o app
    fun loadData() {

    }
}
