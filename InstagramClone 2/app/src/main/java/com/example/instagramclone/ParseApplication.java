package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;


public class ParseApplication extends Application {
     @Override
     public void onCreate() {
         super.onCreate();

         // Register your parse models
         ParseObject.registerSubclass(Post.class);

         Parse.initialize(new Parse.Configuration.Builder(this)
                 .applicationId("aUXtP0Fvrh86FoPd7mpMZMTKyfkYEP1FpBOZhH0H")
                 .clientKey("hGDt5ms0cJJ7qqScdMeHhhmLjbmTkwlkQSoWdVi5")
                 .server("https://parseapi.back4app.com")
                 .build()
         );
     }
}

