package com.alex.kotlin.javadesignmode.facade

/**
 * @author Alex
 * @date 2019-09-05 14:34
 * @email 18238818283@sina.cn
 * @desc ...
 */
class Car() {
    private var dashboard: Dashboard = Dashboard()
    private var engine: Engine = Engine()
    fun start() {
        engine.start()
        dashboard.start()
    }
    fun stop() {
        engine.stop()
        dashboard.stop()
    }
}