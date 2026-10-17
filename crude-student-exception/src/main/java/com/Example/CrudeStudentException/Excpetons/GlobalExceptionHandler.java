package com.Example.CrudeStudentException.Excpetons;

import com.Example.CrudeStudentException.Dto.ExceptionResponseDto;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundExceptions.class)
    ResponseEntity<ExceptionResponseDto> ResourceNotFoundHandler(ResourceNotFoundExceptions ex, HttpServletRequest request){

        ExceptionResponseDto ExceptionResponse= new ExceptionResponseDto(
                LocalDateTime.now(),
               HttpStatus.NOT_FOUND.value(),
                HttpStatus.NOT_FOUND.getReasonPhrase(),
                ex.getMessage(),
                request.getRequestURI()

        );

        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(ExceptionResponse);
    }

    @ExceptionHandler(DuplicateResourceException.class)
    ResponseEntity<ExceptionResponseDto> DuplicateResourceHandler(DuplicateResourceException ex, HttpServletRequest request){
        ExceptionResponseDto exceptionResponseDto = new ExceptionResponseDto(
                LocalDateTime.now(),
                HttpStatus.CONFLICT.value(),
                HttpStatus.CONFLICT.getReasonPhrase(),
                ex.getMessage(),
                request.getRequestURI()
        );

        return ResponseEntity.status(HttpStatus.CONFLICT).body(exceptionResponseDto);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ExceptionResponseDto> HandleMethodArgumentNotValidExceptions(MethodArgumentNotValidException ex,HttpServletRequest request){
        Map<String, String> fieldErrors = new HashMap<>();
        ex.getBindingResult().getFieldErrors()
                .forEach(error -> fieldErrors.put(error.getField(),error.getDefaultMessage()) );

        ExceptionResponseDto exceptionRespnse = new ExceptionResponseDto(
                LocalDateTime.now(),
                HttpStatus.
        )
    }
}
