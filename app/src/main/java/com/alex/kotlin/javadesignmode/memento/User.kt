package com.alex.kotlin.javadesignmode.memento

import java.util.*

/**
 * @author Alex
 * @date 2019-09-09 16:07
 * @email 18238818283@sina.cn
 * @desc ...
 */
class User {
    private var money = 0
    private var memento: Memento = Memento(money)
    fun getMemory() {
        money = Random().nextInt()
    }
    fun createMementoInfo() {
        memento = Memento(money)
    }
    fun restoreMementoInfo() {
        money = memento.money
    }
}