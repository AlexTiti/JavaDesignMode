package com.alex.kotlin.javadesignmode.composite

/**
 * @author Alex
 * @date 2019/4/15 下午4:49
 * @email 18238818283@sina.cn
 * @desc ...
 */
class Directory(val nameFile: String, val parentFile: Entry? = null) : Entry() {

    private val arrayList = ArrayList<Entry>()

    init {
        name = nameFile
        parent = parentFile
    }

    override fun getSize(): Int {
        val iterator = arrayList.iterator()
        var size = 0
        while (iterator.hasNext()){
            size += iterator.next().getSize()
        }
        return size
    }

    override fun printStrign(msg: String) {
        val iterator = arrayList.iterator()
        while (iterator.hasNext()){
            iterator.next().printStrign("$msg / $name")
        }
    }

    override fun getAbslouteName(): String? {
        if (parentFile == null) {
            return name
        }
        return parentFile.getAbslouteName() +"/"+ name
    }

    fun add(entry: Entry) {
        entry.parent = this
        arrayList.add(entry)
    }
}