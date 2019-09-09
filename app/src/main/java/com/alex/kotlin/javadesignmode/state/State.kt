package com.alex.kotlin.javadesignmode.state

/**
 * @author Alex
 * @date 2019-09-09 14:58
 * @email 18238818283@sina.cn
 * @desc ...
 */
interface State {
    fun openLight(light: Light) // 开灯
    fun closeLight(light: Light) // 关灯
}