package com.example;

import org.junit.Before;
import org.junit.Test;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.io.StringWriter;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class HelloWorldServletUnitTest {

    private HelloWorldServlet servlet;
    private HttpServletRequest request;
    private HttpServletResponse response;
    private StringWriter writer;

    @Before
    public void setUp() throws Exception {
        servlet = new HelloWorldServlet();
        request = mock(HttpServletRequest.class);
        response = mock(HttpServletResponse.class);
        writer = new StringWriter();
        when(response.getWriter()).thenReturn(new PrintWriter(writer));
    }

    @Test
    public void shouldReturnHelloWorldMessage() throws Exception {
        servlet.doGet(request, response);
        assertEquals("<html><head><title>Hello World</title></head><body><h1>Hello World!</h1></body></html>",
                writer.toString().trim());
    }
}
