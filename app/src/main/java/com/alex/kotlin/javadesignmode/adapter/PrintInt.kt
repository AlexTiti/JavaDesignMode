package com.alex.kotlin.javadesignmode.adapter

import android.util.Log

/**
 * @author Alex
 * @date 2019/3/29 上午11:02
 * @email 18238818283@sina.cn
 * @desc ...
 */
open class PrintInt {
   protected fun printInt(number : Int){
        Log.e("输出数字","number = $number")
    }
}