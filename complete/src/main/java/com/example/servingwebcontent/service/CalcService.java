package com.example.servingwebcontent.service;

import com.example.servingwebcontent.DTO.TestModelDTO;
import org.springframework.stereotype.Service;

@Service
public interface CalcService {
    Integer calc( TestModelDTO testModel);
}
