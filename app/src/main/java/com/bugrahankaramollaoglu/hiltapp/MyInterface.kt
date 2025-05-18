package com.bugrahankaramollaoglu.hiltapp

import android.app.Application
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.internal.managers.ApplicationComponentManager
import dagger.hilt.android.scopes.ActivityScoped
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

interface MyInterface {
    fun myPrintFun(): String
}

// binds metodu
/*
@InstallIn(ActivityComponent::class)
@Module
abstract class MyModule {


    @ActivityScoped
    @Binds
    abstract fun bindingFunc(myImplementor: MyInterfaceImplementor): MyInterface
}*/

// provide metodu
@InstallIn(SingletonComponent::class)
@Module
class MyModule {
    @Singleton
    @Provides
    fun providerFunction() : MyInterface {
        return MyInterfaceImplementor()
    }

}