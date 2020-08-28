package com.shahed.javaee.converter;

import com.shahed.javaee.dtos.Account;
import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

public class MethodArgumentConverter implements HandlerMethodArgumentResolver {
    @Override
    public boolean supportsParameter(MethodParameter methodParameter) {
        return methodParameter.getParameterType().equals(Account.class);
    }

    @Override
    public Object resolveArgument(MethodParameter methodParameter, ModelAndViewContainer modelAndViewContainer, NativeWebRequest nativeWebRequest, WebDataBinderFactory webDataBinderFactory) throws Exception {
        String accountNo = nativeWebRequest.getParameter("accountNo");
        String accountBalance = nativeWebRequest.getParameter("accountBalance");
        if(isNotSet(accountNo)){
            accountNo = "N/A";
        }

        if(isNotSet(accountBalance)){
            accountBalance = "0";
        }
        return new Account(accountNo,Double.valueOf(accountBalance));
    }

    private boolean isNotSet(String value) {
        return value == null;
    }
}
