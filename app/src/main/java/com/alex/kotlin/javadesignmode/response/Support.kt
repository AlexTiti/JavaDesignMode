package com.alex.kotlin.javadesignmode.response

/**
 * @author Alex
 * @date 2019-09-09 14:21
 * @email 18238818283@sina.cn
 * @desc ...
 */
abstract class Support {
    private var next: Support? = null
    fun setNextSupport(support: Support): Support? {
        next = support
        return next
    }

    abstract fun action(number: Int) // 执行具体的操作
    abstract fun canResolve(number: Int): Boolean // 判断是否符合执行条件
    fun doAction(number: Int) {
        if (canResolve(number)) {
            action(number)
        } else if (next == null) {
            doFailed()
        } else {
            next?.doAction(number)
        }
    }
    fun doFailed() { // 当没有方法处理时
        System.out.println("No Support")
    }
}