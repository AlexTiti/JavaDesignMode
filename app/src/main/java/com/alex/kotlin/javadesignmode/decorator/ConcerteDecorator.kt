package com.alex.kotlin.javadesignmode.decorator

/**
 * @author Alex
 * @date 2019/4/16 下午4:56
 * @email 18238818283@sina.cn
 * @desc ...
 */
class ConcerteDecorator constructor(component: Component) : Decorator(component) {
    override fun getRows(): Int {
        return component.getRows() + 2
    }
    override fun getColumns(): Int {
        return component.getColumns() + 2
    }
    override fun getTextByRow(number: Int): String {
        return when (number) {
            0 -> {
                "----------"
            }
            getRows() - 1 -> {
                "----------"
            }
            else -> {
                "| ${component.getTextByRow(number)} |"
            }
        }
    }
}