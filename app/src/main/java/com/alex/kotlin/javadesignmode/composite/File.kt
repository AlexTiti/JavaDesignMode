package com.alex.kotlin.javadesignmode.composite

import android.util.Log

/**
 * @author Alex
 * @date 2019/4/15 下午4:47
 * @email 18238818283@sina.cn
 * @desc ...
 */
class File(val nameFile: String, val sizeFile: Int = 0, var parentFile: Entry? = null) : Entry() {
    override fun printStrign(msg: String) {
        Log.e("======","$msg / $name")
    }
    override fun getAbslouteName(): String? {
        if (parent == null) {
            return name
        }
        return parent!!.getAbslouteName() +"/"+ name
    }
    init {
        name = nameFile
        parent = parentFile
    }
    override fun getSize(): Int = sizeFile
}