package com.sab1tm.wb_analyzer.feign;

import feign.codec.Decoder;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.cloud.openfeign.support.SpringDecoder;
import org.springframework.context.annotation.Bean;

public class FeignConfiguration {

    @Bean
    public Decoder textPlainDecoder() {
        return new SpringDecoder(() -> new HttpMessageConverters(new CustomMappingJackson2HttpMessageConverter()));
    }

}
