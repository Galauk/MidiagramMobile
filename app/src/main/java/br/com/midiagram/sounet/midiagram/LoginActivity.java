package br.com.midiagram.sounet.midiagram;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class LoginActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView webView = (WebView)findViewById(R.id.webView);

        WebViewClientImpl webViewClient = new WebViewClientImpl(this);
        webView.setWebViewClient(webViewClient);

        webView.loadUrl("https://www.midiagram.com.br/usuario/");

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
/*
        Button naoLoga = (Button)findViewById(R.id.buttonNloga);
        naoLoga.setOnClickListener(new OnClickListener(){
            public void onClick(View v){
                planos();
            }
        });
*/
    }
/*
    private void planos(){
        Intent intent = new Intent(LoginActivity.this, PlanoActivity.class);
        startActivity(intent);
    }
*/
}
