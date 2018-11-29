package cn.edu.nwsuaf.service;

import cn.edu.nwsuaf.entity.Sysuserinfo;
import cn.edu.nwsuaf.entity.SysuserinfoExample;
import cn.edu.nwsuaf.mapper.SysuserinfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by xzy on 2017/5/11.
 */
@Service
public class UserService {
    @Autowired
    private SysuserinfoMapper sysuserinfoMapper;

    /**
     * 增加用户
     *
     * @param sysuserinfo
     * @return
     */
    public int addUser(Sysuserinfo sysuserinfo) {
        return sysuserinfoMapper.insert(sysuserinfo);
    }

    /**
     * 删除用户
     *
     * @param sysuserinfoid
     * @return
     */
    public int deleteUser(int sysuserinfoid) {
        return sysuserinfoMapper.deleteByPrimaryKey(sysuserinfoid);
    }

    /**
     * 查询用户
     *
     * @param sysuserinfoExample
     * @return
     */
    public List<Sysuserinfo> selectByExample(SysuserinfoExample sysuserinfoExample) {
        return sysuserinfoMapper.selectByExample(sysuserinfoExample);
    }

    public Sysuserinfo selectById(int id) {
        return sysuserinfoMapper.selectByPrimaryKey(id);
    }
}
