package com.totoro.study_02_structural_patterns.study_04_decorator_pattern;

/**
 * @author:totoro
 * @createDate:2023/3/21
 * @description:
 */
public class SsoDecorator implements HandlerInterceptor{

    private HandlerInterceptor handlerInterceptor;

    private SsoDecorator(){}

    public SsoDecorator(HandlerInterceptor handlerInterceptor){
        this.handlerInterceptor = handlerInterceptor;
    }

    @Override
    public boolean preHandle(String request, String response, Object handle) {

        return handlerInterceptor.preHandle(request,response,handle);
    }
}
