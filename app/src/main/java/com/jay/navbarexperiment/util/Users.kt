package com.jay.navbarexperiment.util

import android.net.Uri
import com.jay.navbarexperiment.R
import com.jay.navbarexperiment.models.User

class Users {
    var USERS = arrayOf<User>(James, Elizabeth,Robert,Carol,Jennifer,Susan,Michael,William,Karen,Joseph,
        Nancy,Charles,Matthew,Sarah,Jessica,Donald, Mary,Paul,Patricia,Linda,Steve)
    companion object{
        //Men
        val James = User(
            Uri.parse("android.resource//"+ R.drawable.james)
                .toString(),"James", "Male", "Females", "Looking"
        )
        val Robert = User(
            Uri.parse("android.resource//"+ R.drawable.robert)
                .toString(),"Robert", "Male", "Females", "Looking"
        )
        val Michael = User(
            Uri.parse("android.resource//"+ R.drawable.michael)
                .toString(),"Michael", "Male", "Females", "Looking"
        )
        val William = User(
            Uri.parse("android.resource//"+ R.drawable.william)
                .toString(),"William", "Male", "Females", "Not Looking"
        )
        val Joseph = User(
            Uri.parse("android.resource//"+ R.drawable.joseph)
                .toString(),"Joseph", "Male", "Females", "Looking"
        )
        val Charles = User(
            Uri.parse("android.resource//"+ R.drawable.charles)
                .toString(),"Charles", "Male", "Females", "Looking"
        )
        val Matthew = User(
            Uri.parse("android.resource//"+ R.drawable.mattew)
                .toString(),"Matthew", "Male", "Females", "Looking"
        )
        val Donald = User(
            Uri.parse("android.resource//"+ R.drawable.donald)
                .toString(),"Donald", "Male", "Females", "Looking"
        )
        val Paul = User(
            Uri.parse("android.resource//"+ R.drawable.paul)
                .toString(),"Paul", "Male", "Females", "Looking"
        )
        val Steve = User(
            Uri.parse("android.resource//"+ R.drawable.steve)
                .toString(),"Steve", "Male", "Females", "Looking"
        )
        //Women
        val Mary = User(
            Uri.parse("android.resource//"+ R.drawable.mary)
                .toString(),"Mary", "Female", "Males", "Looking"
        )
        val Patricia = User(
            Uri.parse("android.resource//"+ R.drawable.patricia)
                .toString(),"Mary", "Female", "Males", "Looking"
        )
        val Jennifer = User(
            Uri.parse("android.resource//"+ R.drawable.jennifer)
                .toString(),"Mary", "Female", "Males", "Looking"
        )
        val Elizabeth = User(
            Uri.parse("android.resource//"+ R.drawable.elizabeth)
                .toString(),"Mary", "Female", "Males", "Looking"
        )
        val Linda = User(
            Uri.parse("android.resource//"+ R.drawable.linda)
                .toString(),"Mary", "Female", "Males", "Looking"
        )
        val Susan = User(
            Uri.parse("android.resource//"+ R.drawable.susan)
                .toString(),"Mary", "Female", "Males", "Looking"
        )
        val Jessica = User(
            Uri.parse("android.resource//"+ R.drawable.jessica)
                .toString(),"Mary", "Female", "Males", "Looking"
        )
        val Sarah = User(
            Uri.parse("android.resource//"+ R.drawable.sarah)
                .toString(),"Mary", "Female", "Males", "Looking"
        )
        val Karen = User(
            Uri.parse("android.resource//"+ R.drawable.karen)
                .toString(),"Mary", "Female", "Males", "Looking"
        )
        val Nancy = User(
            Uri.parse("android.resource//"+ R.drawable.nancy)
                .toString(),"Mary", "Female", "Males", "Looking"
        )
        val Carol = User(
            Uri.parse("android.resource//"+ R.drawable.carol)
                .toString(),"Mary", "Do Not Identify", "Anyone", "Looking"
        )
    }
}
