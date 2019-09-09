package com.alex.kotlin.javadesignmode.command

/**
 * @author Alex
 * @date 2019-09-09 13:27
 * @email 18238818283@sina.cn
 * @desc ...
 */
class ActionCommand(private val receiver: Receiver) : Command {
    override fun action() {
        receiver.doAction()
    }
}