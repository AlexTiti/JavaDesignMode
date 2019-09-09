package com.alex.kotlin.javadesignmode.iterator

/**
 * @author Alex
 * @date 2019/3/29 上午10:18
 * @email 18238818283@sina.cn
 * @desc ...
 */
interface Iterator {
    /**
     * 判断是否有下一条数据
     */
    fun hasNext(): Boolean
    /**
     * 根据下标遍历获取数据
     */
    fun next() : Any
}