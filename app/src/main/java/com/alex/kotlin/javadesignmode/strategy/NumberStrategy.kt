package com.alex.kotlin.javadesignmode.strategy

import android.util.Log

/**
 * @author Alex
 * @date 2019/4/11 下午3:02
 * @email 18238818283@sina.cn
 * @desc ...
 */
class NumberStrategy : Strategy {
    override fun actionStrategy(number: Int): Int {
        Log.e(" NumberStrategy = ", number.toString())
        return number
    }
}