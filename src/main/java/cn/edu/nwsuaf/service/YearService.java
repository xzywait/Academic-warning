package cn.edu.nwsuaf.service;

import cn.edu.nwsuaf.entity.BtYear;
import cn.edu.nwsuaf.mapper.BtYearMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by xzy on 2017/5/11.
 */
@Service
public class YearService {
    @Autowired
    private BtYearMapper btYearMapper;

    public BtYear getYearById(int id) {
        return btYearMapper.selectByPrimaryKey(id);
    }
}
