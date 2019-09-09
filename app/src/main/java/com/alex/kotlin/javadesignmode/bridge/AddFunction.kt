package com.alex.kotlin.javadesignmode.bridge

import android.util.Log

/**
 * @author Alex
 * @date 2019/4/10 下午4:21
 * @email 18238818283@sina.cn
 * @desc ...
 */
class AddFunction:Function() {
    fun doSomething(msg: String) { // 外观模式
        action(msg)
        print(msg)
    }
}