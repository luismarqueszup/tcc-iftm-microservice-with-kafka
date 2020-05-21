package br.com.send.helper;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

@Configuration
public class MapperHelp {

    private ObjectMapper mapper;

    public MapperHelp(ObjectMapper mapper) {
        this.mapper = mapper;
        this.mapper.registerModule(new JavaTimeModule())
                .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
    }

    public <T> T mapperJsonToObject(String json, Class<T> object) throws IOException {
        return mapper.readValue(json, object);
    }
}
