package com.nf.theroseshop.service;


import com.nf.theroseshop.entity.Diary;

import java.util.List;
import java.util.Map;

public interface IDiaryService {
    List<Diary>selectAllDiary(Map<String, Object> objectMap);
    int delete(Map<String, Object> objectMap);
    int update(Map<String, Object> objectMap);
    int insert(Map<String, Object> objectMap);
}
