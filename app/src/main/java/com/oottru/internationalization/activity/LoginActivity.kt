package com.oottru.internationalization.activity

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import com.oottru.internationalization.R
import com.oottru.internationalization.fragment.LanguagePrefFragment

class LoginActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        navigateTo(LanguagePrefFragment.newInstance())
    }

    private fun navigateTo(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
                .replace(R.id.container_login, fragment).commit()
    }
}