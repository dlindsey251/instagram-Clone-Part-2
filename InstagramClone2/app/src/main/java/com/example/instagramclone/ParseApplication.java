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
                 .applicationId("HowAHuexYBC99eF4CMq9fDfCnJCWtAVb1YZvx0UI")
                 .clientKey("VBUqYDMB1ruxpgxtkeFhDP2e6zbBy7NJ59xBX9Ot")
                 .server("https://parseapi.back4app.com")
                 .build()
         );
     }
 }

