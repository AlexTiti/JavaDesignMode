package com.alex.kotlin.javadesignmode.command

/**
 * @author Alex
 * @date 2019-09-09 13:29
 * @email 18238818283@sina.cn
 * @desc ...
 */
class Invoke(private val command: Command) {
    fun doInvoke() {
        command.action()
    }
}