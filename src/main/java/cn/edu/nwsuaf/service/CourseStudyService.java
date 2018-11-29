package cn.edu.nwsuaf.service;

import java.util.ArrayList;
import java.util.List;

import cn.edu.nwsuaf.mapper.BtOpencourseMapper;
import cn.edu.nwsuaf.mapper.ScoreMapper;
import cn.edu.nwsuaf.model.CourseTuple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by xzy on 2017/5/9.
 */
@Service
public class CourseStudyService {
    @Autowired
    private BtOpencourseMapper opencourseMapper;
    @Autowired
    private ScoreMapper scoreMapper;

    public List<CourseTuple> getCourseTupleByParams(int studentid, String yearname, String semestername, String coursenaturename) {
        CourseTuple requiredCourseTuple = opencourseMapper.selectTotalNumAndCredit
                (studentid, yearname, semestername, coursenaturename).get(0);
        CourseTuple selectedCourseTuple = scoreMapper.selectSelectedNumAndCredit
                (studentid, yearname, semestername, coursenaturename).get(0);
        CourseTuple passedCourseTuple = scoreMapper.selectPassedNumAndCredit
                (studentid, yearname, semestername, coursenaturename).get(0);
        List<CourseTuple> tuples = new ArrayList<CourseTuple>();
        tuples.add(requiredCourseTuple);
        tuples.add(selectedCourseTuple);
        tuples.add(passedCourseTuple);
        return tuples;
    }
}
