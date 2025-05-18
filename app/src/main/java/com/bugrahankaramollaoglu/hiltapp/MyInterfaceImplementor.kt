package com.bugrahankaramollaoglu.hiltapp

import javax.inject.Inject

class MyInterfaceImplementor
@Inject constructor() : MyInterface {
    override fun myPrintFun(): String {
        return "aaa"
    }
}
