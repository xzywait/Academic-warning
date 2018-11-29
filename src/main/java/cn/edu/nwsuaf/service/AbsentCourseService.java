package cn.edu.nwsuaf.service;


import java.util.Date;

import cn.edu.nwsuaf.entity.Absentcoursewarning;
import cn.edu.nwsuaf.entity.BtClassExample;
import cn.edu.nwsuaf.entity.BtCourseExample;
import cn.edu.nwsuaf.entity.StudentExample;
import cn.edu.nwsuaf.entity.WarninglevelExample;
import cn.edu.nwsuaf.mapper.AbsentcoursewarningMapper;
import cn.edu.nwsuaf.mapper.BtClassMapper;
import cn.edu.nwsuaf.mapper.BtCourseMapper;
import cn.edu.nwsuaf.mapper.BtOpencourseMapper;
import cn.edu.nwsuaf.mapper.StudentMapper;
import cn.edu.nwsuaf.mapper.WarninglevelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by xzy on 2017/5/9.
 */
@Service
public class AbsentCourseService {
    @Autowired
    private AbsentcoursewarningMapper absentcoursewarningMapper;
    @Autowired
    private StudentMapper studentMapper;
    @Autowired
    private WarninglevelMapper warninglevelMapper;
    @Autowired
    private BtClassMapper classMapper;
    @Autowired
    private BtCourseMapper courseMapper;
    @Autowired
    private BtOpencourseMapper opencourseMapper;

    public int save(String studentnumber, String coursename, int absenttimes, String warninglevelname, int teacherid, String classname) {
        // TODO: 2017/5/13
        //要存的记录
        Absentcoursewarning absentcoursewarning = new Absentcoursewarning();
        //warninglevelid
        WarninglevelExample warninglevelExample = new WarninglevelExample();
        warninglevelExample.createCriteria().andWarninglevelnameEqualTo(warninglevelname);
        absentcoursewarning.setWarninglevelid(warninglevelMapper.selectByExample(warninglevelExample).get(0).getId());
        //opencourseid
        BtClassExample classExample = new BtClassExample();
        classExample.createCriteria().andClassnameLike(classname);
        int classid = classMapper.selectByExample(classExample).get(0).getId();

        BtCourseExample courseExample = new BtCourseExample();
        courseExample.createCriteria().andCoursenameEqualTo(coursename);
        int courseid = courseMapper.selectByExample(courseExample).get(0).getId();


        int opencourseid = opencourseMapper.selectByParmas(classid, courseid, teacherid).getId();
        absentcoursewarning.setOpencourseid(opencourseid);
        //studentid
        StudentExample studentExample = new StudentExample();
        studentExample.createCriteria().andStudentnumberEqualTo(studentnumber);
        absentcoursewarning.setStudentid(studentMapper.selectByExample(studentExample).get(0).getId());
        //absenttimes
        absentcoursewarning.setTimes(absenttimes);
        //date
        absentcoursewarning.setStatisticstime(new Date());
        absentcoursewarning.setWarningdate(new Date());
        return absentcoursewarningMapper.insert(absentcoursewarning);
    }
}
