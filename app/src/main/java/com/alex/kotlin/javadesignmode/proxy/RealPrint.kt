package com.alex.kotlin.javadesignmode.proxy

import android.util.Log

/**
 * @author Alex
 * @date 2019-09-05 11:30
 * @email 18238818283@sina.cn
 * @desc ...
 */
class RealPrint(private var nameReal: String) : PrintInterface {

    override fun setName(name: String) {
        action()
        nameReal = name
    }

    override fun getName(): String {
        action()
        return nameReal
    }

    override fun print(content: String) {
        Log.e("RealPrint = ", content)
    }

    private fun action(){
    }
}