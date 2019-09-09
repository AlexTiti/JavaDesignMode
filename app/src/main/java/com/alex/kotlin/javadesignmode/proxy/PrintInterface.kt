package com.alex.kotlin.javadesignmode.proxy

/**
 * @author Alex
 * @date 2019-09-05 11:29
 * @email 18238818283@sina.cn
 * @desc ...
 */
interface PrintInterface {
    fun setName(name: String)
    fun getName(): String
    fun print(content: String)
}