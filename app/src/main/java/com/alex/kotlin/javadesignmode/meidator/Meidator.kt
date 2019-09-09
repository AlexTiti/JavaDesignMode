package com.alex.kotlin.javadesignmode.meidator

/**
 * @author Alex
 * @date 2019-09-09 16:32
 * @email 18238818283@sina.cn
 * @desc ...
 */
class Meidator {
   private val first = First()
   private val second = Second()
    fun doAction() {
        first.action()
        second.action()
    }
}