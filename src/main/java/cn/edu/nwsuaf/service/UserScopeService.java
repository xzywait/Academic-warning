package cn.edu.nwsuaf.service;

import cn.edu.nwsuaf.entity.Sysuserscope;
import cn.edu.nwsuaf.entity.SysuserscopeExample;
import cn.edu.nwsuaf.mapper.SysuserscopeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by xzy on 2017/6/1.
 */
@Service
public class UserScopeService {
    @Autowired
    private SysuserscopeMapper sysuserscopeMapper;

    /**
     * 增加用户管理范围
     *
     * @param sysuserscope
     * @return
     */
    public int addUserScope(Sysuserscope sysuserscope) {
        return sysuserscopeMapper.insert(sysuserscope);
    }

    /**
     * 列出用户管理范围
     *
     * @param sysuserscopeExample
     * @return
     */
    public List<Sysuserscope> listByExample(SysuserscopeExample sysuserscopeExample) {
        return sysuserscopeMapper.selectByExample(sysuserscopeExample);
    }
}
