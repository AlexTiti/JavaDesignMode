package com.alex.kotlin.javadesignmode.visitor

/**
 * @author Alex
 * @date 2019/4/15 下午4:49
 * @email 18238818283@sina.cn
 * @desc ...
 */
class DirectoryElement(val nameFile: String, val parentFile: Element? = null) : Element() {
    override fun accept(visitor: Visitor) {
        visitor.visitor(this)
    }
    val arrayList = ArrayList<Element>()
    init {
        name = nameFile
        parent = parentFile
    }
    fun add(entry: Element) {
        entry.parent = this
        arrayList.add(entry)
    }
    fun getInterator() = arrayList.iterator()
}