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
@WebMvcTest(MathServiceController.class)
public class MathServiceControllerTest {
@Autowired
 MockMvc mvc;

@Test
public void testmathCalculateAdd() throws Exception
{
	RequestBuilder request=MockMvcRequestBuilders.get("/math/add?x=2&y=1");
	this.mvc.perform(request)
	.andExpect(status().isOk()).andExpect(content().string("3"));
	
}
@Test
public void testmathCalculateSub() throws Exception
{
	RequestBuilder request=MockMvcRequestBuilders.get("/math/sub?x=2&y=1");
	this.mvc.perform(request)
	.andExpect(status().isOk()).andExpect(content().string("1"));
	
}
@Test
public void testmathCalculateMul() throws Exception
{
	RequestBuilder request=MockMvcRequestBuilders.get("/math/mul?x=2&y=1");
	this.mvc.perform(request)
	.andExpect(status().isOk()).andExpect(content().string("2"));
	
}
@Test
public void testmathCalculateDiv() throws Exception
{
	RequestBuilder request=MockMvcRequestBuilders.get("/math/div?x=2&y=1");
	this.mvc.perform(request)
	.andExpect(status().isOk()).andExpect(content().string("2"));
	
}
}
