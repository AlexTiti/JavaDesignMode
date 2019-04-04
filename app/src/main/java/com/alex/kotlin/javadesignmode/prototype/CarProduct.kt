package com.alex.kotlin.javadesignmode.prototype

import android.graphics.Color

/**
 * @author Alex
 * @date 2019/4/2 下午3:08
 * @email 18238818283@sina.cn
 * @desc ...
 */
class CarProduct : BaseProduct(){

    var coclor = "红色"

    fun createClone(): BaseProduct {
        return super.clone() as BaseProduct
    }

}