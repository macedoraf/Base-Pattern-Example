package br.com.rafael.workhipster

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import br.com.rafael.workhipster.ui.usuario.fragment.ListaUsuarioFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        replaceFragment(ListaUsuarioFragment())
    }


    fun replaceFragment(fragment: Fragment) {
        replaceFragment(fragment, null)

    }

    fun replaceFragment(fragment: Fragment, bundle: Bundle?) {
        var supportFragmentManager = supportFragmentManager
        var transaction = supportFragmentManager.beginTransaction()
        fragment.arguments = bundle
        transaction.replace(R.id.frame, fragment)
        transaction.commit()

    }
}
