package com.alex.kotlin.javadesignmode.factory

import android.util.Log

/**
 * @author Alex
 * @date 2019/4/1 上午10:40
 * @email 18238818283@sina.cn
 * @desc ...
 */
class Bus(val name : String) : Product {

    override fun action() {
        Log.e("Bus -------- ","$name 是公交车！大家都可以挤！")
    }
}