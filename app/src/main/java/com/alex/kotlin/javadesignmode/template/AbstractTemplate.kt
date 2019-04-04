package com.alex.kotlin.javadesignmode.template

/**
 * @author Alex
 * @date 2019/3/30 上午11:08
 * @email 18238818283@sina.cn
 * @desc ...
 */
abstract class AbstractTemplate {

    /**
     * 起床之后的事情
     */
   protected abstract fun weakUp()

    /**
     * 进入办公室
     */
    protected abstract fun enteringTheOffice()

    /**
     * 打开电闹
     */
    protected abstract fun openCompute()

    /**
     * 工作
     */
    protected abstract fun doJob()

    /**
     * 回家
     */
    protected abstract fun goHome()

    fun actionForWorker() {
        weakUp()
        enteringTheOffice()
        openCompute()
        doJob()
        goHome()
    }
}