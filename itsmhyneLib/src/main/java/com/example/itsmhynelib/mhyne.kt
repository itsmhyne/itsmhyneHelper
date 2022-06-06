package com.example.itsmhynelib

import android.util.Log

class mhyne {
    companion object  Builder {
        private const val TAG = "itsmhyne helper library"

        fun i(message: String){
            Log.i(TAG, message)
        }
    }
}