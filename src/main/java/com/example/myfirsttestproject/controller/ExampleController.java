
package com.example.myfirsttestproject.controller;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import com.example.myfirsttestproject.storage.MicroStream;


@Controller("/")
public class ExampleController
{
	@Get
	public HttpResponse<String> root()
	{
		return HttpResponse.ok("Data root, created @ " + MicroStream.root().getData());
	}
}
