package com.veterinarytrackingsystem.handler;

import com.veterinarytrackingsystem.models.error.ErrorResponse;
import org.springframework.beans.factory.BeanCreationException;
import org.springframework.beans.factory.UnsatisfiedDependencyException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class RestControllerException {


    @ExceptionHandler(UnsatisfiedDependencyException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorResponse handleUnsatisfiedDependencyException(UnsatisfiedDependencyException e) {
        return new ErrorResponse("Unsatisfied dependency expressed,Error creating bean",
                e.getMessage());
    }

    @ExceptionHandler(BeanCreationException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorResponse handleBeanCreationException(BeanCreationException e) {
        return new ErrorResponse("Error creating bean.",
                e.getMessage());
    }


}
