package com.l237even.bookkeeping

import android.annotation.SuppressLint
import android.app.Activity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : Activity() {
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val webView = WebView(this).apply {
            settings.javaScriptEnabled = true
            settings.domStorageEnabled = true
            settings.allowFileAccess = true
            settings.allowContentAccess = false
            settings.setSupportZoom(false)
            webViewClient = WebViewClient()
            webChromeClient = WebChromeClient()
            loadUrl("file:///android_asset/index.html")
        }
        setContentView(webView)
    }

    @Deprecated("Deprecated in Android")
    override fun onBackPressed() {
        val view = (window.decorView.findViewById(android.R.id.content) as? android.view.ViewGroup)
            ?.getChildAt(0) as? WebView
        if (view?.canGoBack() == true) view.goBack() else super.onBackPressed()
    }
}
