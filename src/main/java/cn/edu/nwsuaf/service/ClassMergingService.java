package cn.edu.nwsuaf.service;

import cn.edu.nwsuaf.entity.BtClassmerging;
import cn.edu.nwsuaf.mapper.BtClassmergingMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by xzy on 2017/5/6.
 */
@Service
public class ClassMergingService {
    @Autowired
    private BtClassmergingMapper classmergingMapper;

    public BtClassmerging getBtClassmerginById(int id) {
        return classmergingMapper.selectByPrimaryKey(id);
    }
}
