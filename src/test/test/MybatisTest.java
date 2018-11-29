package test;

import cn.edu.nwsuaf.entity.*;
import cn.edu.nwsuaf.mapper.*;
import cn.edu.nwsuaf.model.AbsentCourseModel;
import cn.edu.nwsuaf.model.AbsentExamModel;
import cn.edu.nwsuaf.model.CourseTuple;
import cn.edu.nwsuaf.model.UsuallyWarnModel;
import cn.edu.nwsuaf.service.ClassService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xzy on 2017/4/22.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext-*.xml")
public class MybatisTest {
    @Autowired
    private StudentMapper studentMapper;
    @Autowired
    private BtStudentteacheringplanMapper studentteacheringplanMapper;
    @Autowired
    private UsuallycheckwangingMapper usuallycheckwangingMapper;

    @Autowired
    private AbsentcoursewarningMapper absentcoursewarningMapper;
    @Autowired
    private AbsentexamwarningMapper absentexamwarningMapper;
    @Autowired
    private BtOpencourseMapper opencourseMapper;

    @Autowired
    private SpetsMapper spetsMapper;
    @Autowired
    private ScoreMapper scoreMapper;
    @Autowired
    private StudentwarningMapper studentwarningMapper;
    @Autowired
    private ClassService classService;

    @Test
    public void testAdd(){
        Student student = new Student();
        student.setStudentname("徐志远");
        student.setSex("男");
        studentMapper.insert(student);

    }
    @Test
    public void testDelete(){
        studentMapper.deleteByPrimaryKey(21);
    }
    @Test
    public void testUpdate(){
        StudentExample example = new StudentExample();

       List<Student> student = studentMapper.selectByExample(example);
        for (Student stu:student){
            System.out.println(stu.getStudentname());
        }
      /*  student.setStuname("chrisyoungddddddddddd");
        studentMapper.updateByPrimaryKey(student);*/
    }
    @Test
    public void testPageHelper(){
        StudentExample example = new StudentExample();
        PageHelper.startPage(1,5);
        List<Student> list = studentMapper.selectByExample(example);
        for (Student student:list){
            System.out.println(student.getStudentname());
        }
        PageInfo<Student> pageInfo = new PageInfo<Student>(list);
        long total =pageInfo.getTotal();
        System.out.print("共有商品："+total);
    }
    @Test
    public void selectStudentByid(){
        Student student = studentMapper.selectByPrimaryKey(22);
        System.out.print(student.getSex());
    }
    @Test
    public void getTotalRequireScoreByStudentId(){
        int studentid=288553;
        BtStudentteacheringplanExample example = new BtStudentteacheringplanExample();
        example.createCriteria().andStudentidEqualTo(studentid);

        List<BtStudentteacheringplan> list = studentteacheringplanMapper.selectByExample(example);
        System.out.println(list.size()+"条数据");
        int totalScore=0;
        for(BtStudentteacheringplan plan :list){
            totalScore+=plan.getScorerequire();
        }
        System.out.print(totalScore);
    }
    @Test
    public  void testUsualwarn(){
        List<UsuallyWarnModel> modelList=usuallycheckwangingMapper.selectUsuallyWarnByStudentId(238936);
        System.out.print(modelList.size());
    }
    @Test
    public void testAbsentCourse(){
        List<AbsentCourseModel> modelList = absentcoursewarningMapper.selectAbsentCourseWarnByStudentId(295333);
        System.out.print(modelList.size());

    }

@Test
    public void testAbsentExam(){
        List<AbsentExamModel> modelList = absentexamwarningMapper.selectAbsentExamWarnByStudentId(218988);
        System.out.print(modelList.size());

    }

    @Test
    public void testSpet(){
        SpetsExample example = new SpetsExample();
        example.createCriteria().andStudentidEqualTo(294737).andSpetsnameEqualTo("大学英语四级");
        example.setOrderByClause("spetstime DESC");
       List<Spets> spetses= spetsMapper.selectByExample(example);
    }
    @Test
    public void getCourseTupleByParams(){
        int studentid=294737;
        String yearname="2016";
        String semestername="秋";
        String coursenaturename=null;
        CourseTuple requiredCourseTuple = opencourseMapper.selectTotalNumAndCredit
                (studentid,yearname,semestername,coursenaturename).get(0);
        CourseTuple selectedCourseTuple = scoreMapper.selectSelectedNumAndCredit
                (studentid, yearname, semestername, coursenaturename).get(0);
        CourseTuple passedCourseTuple = scoreMapper.selectPassedNumAndCredit
                (studentid, yearname, semestername, coursenaturename).get(0);
        List<CourseTuple> tuples = new ArrayList<>();
        tuples.add(requiredCourseTuple);
        tuples.add(selectedCourseTuple);
        tuples.add(passedCourseTuple);

    }
    @Test
    public void findByUser( ){
        StudentExample studentExample = new StudentExample();
        studentExample.createCriteria().andUseridEqualTo(294737);
        System.out.println( studentMapper.selectByExample(studentExample).get(0));
    }
    @Test
    public void studentwarningtest() {
        StudentwarningExample example = new StudentwarningExample();
        example.createCriteria().andStudentidEqualTo(1);
        studentwarningMapper.selectWarningModelByExample(example);
    }

    @Test
    public void  findClassByTeacherIdTest(){
        List<BtClass> classList = classService.getClassByTeacherId(459792);
    }
}
