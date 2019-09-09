package com.alex.kotlin.javadesignmode.state

/**
 * @author Alex
 * @date 2019-09-09 15:00
 * @email 18238818283@sina.cn
 * @desc ...
 */
class StateClose : State {
    companion object {
        val close = StateClose()
    }
    override fun openLight(light: Light) {
        light.isLight = true
        System.out.println("打开灯了")
        light.steState(StateOpen.open)
    }

    override fun closeLight(light: Light) {
        System.out.println("灯还没开")
    }
}