package com.alex.kotlin.javadesignmode.proxy

/**
 * @author Alex
 * @date 2019-09-05 11:30
 * @email 18238818283@sina.cn
 * @desc ...
 */
class ProxyPrint( private var nameProxy: String) : PrintInterface {

   private var realPrint: RealPrint? = null

    override fun setName(name: String) {
        realPrint?.setName(name)
        nameProxy = name
    }
    override fun getName(): String {
        return nameProxy
    }
    override fun print(content: String) {
        initRealPrint()
        realPrint?.print(content)
    }
    private fun initRealPrint() {
        if (realPrint == null) {
            realPrint = RealPrint(nameProxy)
        }
    }
}