package com.bugrahankaramollaoglu.hiltapp

import javax.inject.Inject

class ClassExample
@Inject constructor(private val myInterfaceImplementor: MyInterface) {

    fun myFun(): String {
        return "Working ${myInterfaceImplementor.myPrintFun()}"
    }

}