package com.example.hilt.dagger2

import android.util.Log

class A constructor(message: String)

class TestA {
    fun test() {
        val a = A("testA")
        Log.e("Test", a.toString())
    }
}


class TestB {
    fun test() {
        val a = A("testB")
        Log.e("Test", a.toString())
    }
}


/**构造方法注入*/
class TestC(private val a: A) {
    fun test() {
        Log.e("Test", a.toString())
    }
}

/**setter方法注入*/
class TestD {
    private var a: A? = null

    fun setA(a: A) {
        this.a = a
    }

    fun test() {
        if (a != null) {
            Log.e("Test", a.toString())
        }
    }
}


/**接口注入*/

class TestE : ProvideA {
    private var a: A? = null
    override fun setA(a: A) {
        this.a = a
    }

    fun test() {
        if (a != null) {
            Log.e("Test", a.toString())
        }
    }
}

interface ProvideA {
    fun setA(a: A)
}