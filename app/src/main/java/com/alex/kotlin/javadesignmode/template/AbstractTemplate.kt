package com.alex.kotlin.javadesignmode.template

/**
 * @author Alex
 * @date 2019/3/30 上午11:08
 * @email 18238818283@sina.cn
 * @desc ...
 */
abstract class AbstractTemplate {
    protected abstract fun weakUp() //起床之后的事情
    protected abstract fun enteringTheOffice() //进入办公室
    protected abstract fun openCompute() //打开电脑
    protected abstract fun doJob() //工作
    protected abstract fun goHome()  //回家

    fun actionForWorker() {
        weakUp()
        enteringTheOffice()
        openCompute()
        doJob()
        goHome()
    }
}