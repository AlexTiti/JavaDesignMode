package com.alex.kotlin.javadesignmode.decorator

/**
 * @author Alex
 * @date 2019/4/16 下午4:53
 * @email 18238818283@sina.cn
 * @desc ...
 */
class ConcerteComponent(val text: String) : Component() {
    override fun getRows() = 1
    override fun getColumns(): Int {
        return text.length
    }
    override fun getTextByRow(number: Int): String {
        return text
    }
}