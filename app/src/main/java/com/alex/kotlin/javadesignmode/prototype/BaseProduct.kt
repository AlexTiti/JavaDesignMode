package com.alex.kotlin.javadesignmode.prototype

/**
 * @author Alex
 * @date 2019/4/2 下午3:09
 * @email 18238818283@sina.cn
 * @desc 保存基本属性的原型模式
 */
open class BaseProduct : Cloneable {
    var name: String? = null
    var price = 0
}