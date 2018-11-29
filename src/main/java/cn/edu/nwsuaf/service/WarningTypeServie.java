package cn.edu.nwsuaf.service;

import cn.edu.nwsuaf.entity.Warningtype;
import cn.edu.nwsuaf.mapper.WarningtypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by xzy on 2017/5/11.
 */
@Service
public class WarningTypeServie {
    @Autowired
    private WarningtypeMapper warningtypeMapper;

    public Warningtype getWarningTypeById(int id) {
        return warningtypeMapper.selectByPrimaryKey(id);
    }
}
