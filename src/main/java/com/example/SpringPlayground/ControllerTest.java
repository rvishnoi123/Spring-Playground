package com.example.SpringPlayground;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@RunWith(SpringRunner.class)
@WebMvcTest(Controller.class)
public class ControllerTest {
@Autowired
private MockMvc mvc;

@Test
public void testHomePage() throws Exception
{
	RequestBuilder request=MockMvcRequestBuilders.get("/app/hello");
	this.mvc.perform(request)
	.andExpect(status().isOk())
	.andExpect(content().string("hello"));
}
@Test
public void testMathPi() throws Exception
{
	RequestBuilder request=MockMvcRequestBuilders.get("/app/bar");
	this.mvc.perform(request)
	.andExpect(status().isOk())
	.andExpect(content().string("3.14"));
}

}
