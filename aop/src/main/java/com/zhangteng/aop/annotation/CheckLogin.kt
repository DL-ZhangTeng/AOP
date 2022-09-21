package com.zhangteng.aop.annotation

/**
 * description: 登录状态注解，登录状态存入SP中，sp名loginInfo，键isLogin
 * author: Swing
 * date: 2022/7/22
 */
@kotlin.annotation.Retention(AnnotationRetention.RUNTIME)
@Target(
    AnnotationTarget.FUNCTION,
    AnnotationTarget.PROPERTY_GETTER,
    AnnotationTarget.PROPERTY_SETTER
)
annotation class CheckLogin(
    /**
     * 登录页全类名
     */
    val value: String
)