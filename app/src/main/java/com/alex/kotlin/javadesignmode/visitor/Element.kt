package com.alex.kotlin.javadesignmode.visitor

/**
 * @author Alex
 * @date 2019/4/15 下午4:45
 * @email 18238818283@sina.cn
 * @desc ...
 */
abstract class Element {
    var parent: Element? = null
    var name: String? = null
    abstract fun accept(visitor: Visitor)
}