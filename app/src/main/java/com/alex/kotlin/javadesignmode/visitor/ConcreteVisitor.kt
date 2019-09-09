package com.alex.kotlin.javadesignmode.visitor

import android.util.Log

/**
 * @author Alex
 * @date 2019/4/17 下午4:19
 * @email 18238818283@sina.cn
 * @desc ...
 */
class ConcreteVisitor : Visitor {

    override fun visitor(file: FileElement) {
        Log.e("File=======", file.name)
    }

    override fun visitor(directory: DirectoryElement) {
        Log.e("Directory=======", directory.name)
        val iterator = directory.getInterator()
        while (iterator.hasNext()) {
            val file = iterator.next()
            file.accept(this)
        }

    }
}