package com.siddhary.airforce;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
public class MainActivity extends Activity {
 protected void onCreate(Bundle s){
 super.onCreate(s);
 WebView w=new WebView(this);
 w.getSettings().setJavaScriptEnabled(true);
 w.loadUrl("file:///android_asset/index.html");
 setContentView(w);
 }
}
