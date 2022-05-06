package com.example.servingwebcontent.service.impl;

import com.example.servingwebcontent.DTO.TestModelDTO;
import com.example.servingwebcontent.service.CalcService;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class CalcServiceImpl implements CalcService {
    private static final Integer DEFAULT = 836;

    @Override
    public Integer calc(TestModelDTO testModel) {
        return Objects.nonNull(testModel) &&
                Objects.nonNull(testModel.getValue1()) && Objects.nonNull(testModel.getValue2()) ?
                testModel.getValue1() + testModel.getValue2() : DEFAULT;
    }
}
