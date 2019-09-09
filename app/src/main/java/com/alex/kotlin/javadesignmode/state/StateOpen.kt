package com.alex.kotlin.javadesignmode.state

/**
 * @author Alex
 * @date 2019-09-09 15:00
 * @email 18238818283@sina.cn
 * @desc ...
 */
class StateOpen : State {
    companion object {
        val open = StateOpen()
    }
    override fun openLight(light: Light) {
        System.out.println("灯已经开了")
    }
    override fun closeLight(light: Light) {
        light.isLight = false
        System.out.println("灯关闭了")
        light.steState(StateClose.close)
    }
}