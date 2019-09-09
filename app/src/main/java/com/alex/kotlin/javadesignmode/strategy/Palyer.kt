package com.alex.kotlin.javadesignmode.strategy

/**
 * @author Alex
 * @date 2019/4/11 下午3:06
 * @email 18238818283@sina.cn
 * @desc ...
 */
class Palyer(private val strategy: Strategy) {

    fun play(number: Int) {
        val num = strategy.actionStrategy(number)
    }

}