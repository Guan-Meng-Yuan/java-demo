package com.example.demo.service;

import com.example.demo.api.FieldMapApi;
import com.example.demo.mapper.FieldMapMapper;
import com.example.demo.model.domain.FieldMap;
import com.mybatisflex.spring.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class FieldMapService extends ServiceImpl<FieldMapMapper, FieldMap> implements FieldMapApi {

}