package com.zvvnmod.meco.common;

import com.zvvnmod.meco.common.result.ErrorResult;
import com.zvvnmod.meco.common.result.ResultBase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

@ControllerAdvice
public abstract class SuperController {
    @Resource
    protected HttpSession session;
    @Resource
    protected HttpServletRequest httpServletRequest;
    @Resource
    protected HttpServletResponse httpServletResponse;

    private static final Logger logger = LoggerFactory.getLogger(SuperController.class);

    @ExceptionHandler(MecoException.class)
    @ResponseBody
    public ResultBase eastModExceptionHandler(MecoException e) {
        logger.warn("code:" + e.getCode() + ",message:" + e.getMessage());
        return ErrorResult.get(e.getCode(), e.getMessage());
    }

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResultBase ExceptionHandler(Exception e) {
        ByteArrayOutputStream errorStream = new ByteArrayOutputStream();
        e.printStackTrace(new PrintStream(errorStream));
        logger.error(errorStream.toString());
        return ErrorResult.get(State.INTERNAL_SERVER_ERROR);
    }
}
