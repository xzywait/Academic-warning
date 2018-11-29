package cn.edu.nwsuaf.service;

import cn.edu.nwsuaf.entity.Parent;
import cn.edu.nwsuaf.mapper.ParentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by xzy on 2017/5/6.
 */
@Service
public class ParentService {
    @Autowired
    private ParentMapper parentMapper;

    public Parent getParentById(int id) {
        return parentMapper.selectByPrimaryKey(id);
    }
}
