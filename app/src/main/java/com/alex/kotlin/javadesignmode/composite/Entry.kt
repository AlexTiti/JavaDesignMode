package com.alex.kotlin.javadesignmode.composite

/**
 * @author Alex
 * @date 2019/4/15 下午4:45
 * @email 18238818283@sina.cn
 * @desc ...
 */
abstract class Entry {
    var parent: Entry? = null
    var name: String? = null

    abstract fun getSize(): Int
    abstract fun getAbslouteName() : String?
    abstract fun printStrign( msg: String)
}