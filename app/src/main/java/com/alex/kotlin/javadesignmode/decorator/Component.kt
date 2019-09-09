package com.alex.kotlin.javadesignmode.decorator

/**
 * @author Alex
 * @date 2019/4/16 下午4:48
 * @email 18238818283@sina.cn
 * @desc ...
 */
abstract class Component {

    abstract fun getRows(): Int // 获取字符串行数
    abstract fun getColumns(): Int // 获取字符串列数
    abstract fun getTextByRow(number: Int): String // 获取对应的字符串

    fun show() { // 显示内容
        val rows = getRows()
        for (index in 0 until rows) {
            System.out.println(getTextByRow(index))
        }
    }
}