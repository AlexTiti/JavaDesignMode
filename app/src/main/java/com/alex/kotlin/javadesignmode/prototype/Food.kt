package com.alex.kotlin.javadesignmode.prototype

/**
 * @author Alex
 * @date 2019/4/2 下午3:19
 * @email 18238818283@sina.cn
 * @desc ...
 */
open class Food(
    var price: Int = 0,
    var shop: String = "Shop"
) : Cloneable{

    /**
     * 因为浅复制的原因，Food也要实现Cloneable并且提供复制方法
     */
    fun createClone(): Food {
        return super.clone() as Food
    }
}