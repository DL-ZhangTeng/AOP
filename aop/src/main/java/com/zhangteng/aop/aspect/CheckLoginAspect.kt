package com.zhangteng.aop.aspect

import android.content.Context
import android.content.Intent
import com.zhangteng.aop.annotation.CheckLogin
import com.zhangteng.utils.e
import com.zhangteng.utils.getFromSP
import org.aspectj.lang.ProceedingJoinPoint
import org.aspectj.lang.annotation.Around
import org.aspectj.lang.annotation.Aspect
import org.aspectj.lang.annotation.Pointcut

/**
 * description: 登录状态检查切面
 * author: Swing
 * date: 2022/7/22
 */
@Aspect
class CheckLoginAspect {
    /**
     * 方法切入点
     */
    @Pointcut("execution(@com.zhangteng.aop.annotation.CheckLogin * *(..))")
    fun pointCut() {
    }

    /**
     * 在连接点进行方法替换
     */
    @Around("pointCut() && @annotation(checkLogin)")
    @Throws(Throwable::class)
    fun joinPoint(joinPoint: ProceedingJoinPoint, checkLogin: CheckLogin) {
        val context = joinPoint.getThis() as Context
        val isLogin: Boolean = context.getFromSP(spName = "loginInfo", key = "isLogin", defaultObject = false) as Boolean
        if (!isLogin) {
            if (checkLogin.value.isNotEmpty()) {
                try {
                    context.startActivity(
                        Intent(
                            context,
                            Class.forName(checkLogin.value)
                        )
                    )
                } catch (e: Exception) {
                    e.toString().e("CheckLogin")
                }
            }
            return
        }
        //执行原方法
        joinPoint.proceed()
    }
}