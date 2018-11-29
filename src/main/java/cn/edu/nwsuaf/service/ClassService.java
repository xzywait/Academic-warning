package cn.edu.nwsuaf.service;

import java.util.List;

import cn.edu.nwsuaf.entity.BtClass;
import cn.edu.nwsuaf.mapper.BtClassMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by xzy on 2017/5/6.
 */
@Service
public class ClassService {
    @Autowired
    BtClassMapper classMapper;

    public BtClass getClassByid(int id) {
        return classMapper.selectByPrimaryKey(id);
    }

    public List<BtClass> getClassByTeacherId(int teacherid) {
        return classMapper.selectByTeacherid(teacherid);
    }
}
