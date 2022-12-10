package com.Dao;

import com.Entity.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface TeacherDao {
    /*
    * 添加老师
    * @param teacher
    * @return
    * */
    int insertTeacher(Teacher teacher);

    /*
     * 删除老师
     * @param list
     * @return
     * */
    int deleteTeacher(List<Teacher> list);

    /*
     * 修改老师
     * @param teacher
     * @return
     * */
    int updateTeacher(Teacher teacher);

    /*
     * 根据id查找教师
     * @param tid
     * @return
     * */
    Teacher selectTeacher(int tid);

    /*
     * 获取老师数量
     * @return
     * */
    int getTeachersNum();

    /*
     * 分页查找老师
     * @param begin 起始索引 从0开始
     * @return size 每页大小
     * */
    List<Teacher> selectTeachersByLimit(@Param("begin") int begin, @Param("size") int size);

    /*
     * 获取搜索数量
     * @param map tnum.tname
     * @return
     * */
    int getSearchCount(Map<String,Object> map);

    /*
     * 检测登录
     * @param map username,password
     * @return
     * */
    Teacher checkByUsernameAndPassword(Map<String,Object> map);

    /*
     * 查询所有老师
     * @param
     * @return
     * */
    List<Teacher> selectTeachers();
}
