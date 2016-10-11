package com.demo.swagger.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.wordnik.swagger.annotations.ApiOperation;

@RestController
public class HelloWorldController {

	@ApiOperation(httpMethod = "GET", value = "Get Example")
	@RequestMapping(method=RequestMethod.GET, value="get")
	@ResponseStatus(HttpStatus.OK)
	public String get() {
		return "{\"message\":\"Hello World Swagger - Get Example!\"}";
	}

	@ApiOperation(httpMethod = "POST", value = "Post Example")
	@RequestMapping(method=RequestMethod.POST, value="post")
	@ResponseStatus(HttpStatus.CREATED)
	public String post(@RequestBody String requestBody) {
		return "{\"message\":\"Hello World Swagger - Post Example!\"," +
				"\"responseBody\": \"" + requestBody + "\"" +
				"}";
	}

	@ApiOperation(httpMethod = "PUT", value = "Put Example")
	@RequestMapping(method=RequestMethod.PUT, value="put")
	@ResponseStatus(HttpStatus.OK)
	public String put(@RequestBody String requestBody) {
		return "{\"message\":\"Hello World Swagger - Put Example!\"," +
				"\"responseBody\": \"" + requestBody + "\"" +
				"}";
	}

	@ApiOperation(httpMethod = "DELETE", value = "Delete Example")
	@RequestMapping(method=RequestMethod.DELETE, value="delete")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@RequestBody String requestBody) {
		System.out.println("Delete invoked - " +  requestBody);
	}
}
