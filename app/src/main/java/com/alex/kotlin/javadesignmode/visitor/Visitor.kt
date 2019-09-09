package com.alex.kotlin.javadesignmode.visitor

/**
 * @author Alex
 * @date 2019/4/17 下午4:16
 * @email 18238818283@sina.cn
 * @desc ...
 */
interface Visitor {
    fun visitor(file: FileElement)
    fun visitor(directory: DirectoryElement)
}