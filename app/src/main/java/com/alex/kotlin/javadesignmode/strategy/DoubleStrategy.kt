package com.alex.kotlin.javadesignmode.strategy

/**
 * @author Alex
 * @date 2019/4/11 下午3:10
 * @email 18238818283@sina.cn
 * @desc ...
 */
class DoubleStrategy : Strategy {
    override fun actionStrategy(number: Int): Int {
        return number * number
    }
}