package cn.edu.nwsuaf.service;

import cn.edu.nwsuaf.entity.Warninglevel;
import cn.edu.nwsuaf.mapper.WarninglevelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by xzy on 2017/5/6.
 */
@Service
public class WarningLevelService {
    @Autowired
    private WarninglevelMapper warninglevelMapper;

    public Warninglevel getWarninglevelById(int id) {
        return warninglevelMapper.selectByPrimaryKey(id);
    }
}
