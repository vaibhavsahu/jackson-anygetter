package com.vaibhav.example.jacksonanygetter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class JacksonAnygetterApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    public void WhenSerializingUsingAnyGetter_thenCorrect() throws JsonProcessingException {
        SampleJavaBean bean = new SampleJavaBean("Test");
        bean.getProperties().put("key1", "val1");
        bean.getProperties().put("key2", "val2");
        String val = new ObjectMapper().writeValueAsString(bean);
        assertThat(val, containsString("Test"));
        assertThat(val, containsString("val1"));
        assertThat(val, containsString("val2"));
    }

    @Test
    public void WhenSerializingUsingGetter_thenCorrect() throws JsonProcessingException {
        SampleJavaBean bean = new SampleJavaBean("Test");
        String val = new ObjectMapper().writeValueAsString(bean);

        assertThat(val, containsString("Test"));
       // assertThat(val, containsString("val2"));
    }

}
