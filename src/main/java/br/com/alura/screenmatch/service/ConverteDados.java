package br.com.alura.screenmatch.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConverteDados implements IConverteDados {
    private ObjectMapper mapper = new ObjectMapper(); //mapper objeto do jackson faz a conversão

    @Override
    public <T> T obterDados(String json, Class<T> classe) {
        try {
            return mapper.readValue(json, classe); //mapper lê o json e transforma na classe passada
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
