package com.wo.rest.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatusCode;

@Getter
@Setter
@AllArgsConstructor
public class ResponseFormat {

    private Object body;
    private HttpStatusCode statusCode;
    private int statusCodeValue;

}
