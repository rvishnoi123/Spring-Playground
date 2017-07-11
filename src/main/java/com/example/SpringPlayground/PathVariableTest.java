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
@WebMvcTest(PathController.class)
public class PathVariableTest {
	@Autowired
	private MockMvc mvc;


@Test
public void testmathCalculateVolume() throws Exception
{
	RequestBuilder request=MockMvcRequestBuilders.get("/math/volume/24/3/6");
	this.mvc.perform(request)
	.andExpect(status().isOk()).andExpect(content().string("432"));
	
}

}
