package com.alex.kotlin.javadesignmode.builder

import android.util.Log

/**
 * @author Alex
 * @date 2019/4/4 下午1:40
 * @email 18238818283@sina.cn
 * @desc ...
 */
class ConcreteBuilder : Builder {

    override fun printFirst(msg : String) {
       Log.e("ConcreteBuilder ===","$msg in PrintFirst !" )
    }

    override fun printSecond(msg : String) {
        Log.e("ConcreteBuilder ===","$msg in PrintSecond !")
    }
}