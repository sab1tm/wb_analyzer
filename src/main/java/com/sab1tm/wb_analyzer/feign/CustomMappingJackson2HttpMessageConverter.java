package com.sab1tm.wb_analyzer.feign;

import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

import java.util.Collections;
import java.util.List;

public class CustomMappingJackson2HttpMessageConverter extends MappingJackson2HttpMessageConverter {

    @Override
    public void setSupportedMediaTypes(List<MediaType> supportedMediaTypes) {
        super.setSupportedMediaTypes(Collections.singletonList(MediaType.TEXT_PLAIN));
    }

}
