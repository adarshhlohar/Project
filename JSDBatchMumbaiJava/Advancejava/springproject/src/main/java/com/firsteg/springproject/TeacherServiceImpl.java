package com.firsteg.springproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    TeacherRepository trepo;

    @Override
    public Teacher addTeacher(Teacher teacher) {
        return trepo.save(teacher);
    }

    @Override
    public Teacher getTeacherDetail(int tid) {
        return trepo.findById(tid).orElseThrow(() -> new TeacherNotFoundException("Teacher Id is not correct"));
    }

    @Override
    public Teacher updateTeacherDetail(Teacher teacher, int tid) {
        {
            Teacher updatedTeacher = trepo.findById(tid)
                    .orElseThrow(() -> new TeacherNotFoundException("Teacher Id is not correct"));
            // set new values
            updatedTeacher.setTphone(teacher.getTphone());
            updatedTeacher.setDesignation(teacher.getDesignation());

            trepo.save(updatedTeacher); // saving updated details
            return updatedTeacher;
        }
    }

    @Override
    public void deleteTeacherDetail(int tid) {
        trepo.findById(tid).orElseThrow(() -> new TeacherNotFoundException("Teacher Id is not correct"));
        trepo.deleteById(tid);
    }
}
