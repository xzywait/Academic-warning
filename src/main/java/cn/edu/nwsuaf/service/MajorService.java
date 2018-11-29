package cn.edu.nwsuaf.service;

import cn.edu.nwsuaf.entity.BtMajor;
import cn.edu.nwsuaf.mapper.BtMajorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by xzy on 2017/5/6.
 */
@Service
public class MajorService {
    @Autowired
    private BtMajorMapper majorMapper;

    public String getMajorName(int majorid) {
        return majorMapper.selectByPrimaryKey(majorid).getMajorname();
    }

    public BtMajor getMajorByid(int majorid) {
        return majorMapper.selectByPrimaryKey(majorid);
    }
}
