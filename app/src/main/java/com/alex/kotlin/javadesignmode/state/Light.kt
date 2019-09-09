package com.alex.kotlin.javadesignmode.state

/**
 * @author Alex
 * @date 2019-09-09 15:04
 * @email 18238818283@sina.cn
 * @desc ...
 */
class Light {
    var isLight = false
    private var state: State = StateClose.close

    fun steState(state: State) {
        this.state = state
    }
    fun open() {
        state.openLight(this)
    }
    fun close() {
        state.closeLight(this)
    }
}