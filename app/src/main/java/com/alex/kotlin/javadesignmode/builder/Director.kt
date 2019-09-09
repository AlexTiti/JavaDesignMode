package com.alex.kotlin.javadesignmode.builder

/**
 * @author Alex
 * @date 2019/4/4 下午1:40
 * @email 18238818283@sina.cn
 * @desc ...
 */
class Director(private val builder: Builder) {

    fun construct() {
        builder.printFirst("AAAAA")
        builder.printSecond("BBBBB")
    }

}