package com.example.demo.controller;

import com.example.demo.mapper.FieldMapMapper;
import com.example.demo.model.domain.FieldMap;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 测试接口
 */
@RestController
@RequestMapping("fieldMaps")
@RequiredArgsConstructor
public class FieldMapController {
    private final FieldMapMapper fieldMapMapper;

    @GetMapping
    public List<FieldMap> fieldMapList() {
        return fieldMapMapper.selectAll();
    }

    @PostMapping@Transactional
    public Boolean saveFieldMap(@RequestBody FieldMap fieldMap) {
        int insert = fieldMapMapper.insert(fieldMap);
        System.out.println(insert);
        System.out.println(fieldMap.getId());
        return Boolean.TRUE;
    }
}