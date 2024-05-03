package com.service.ms.student.app.infrastucture.adapters.input.rest.mapper;

import com.service.ms.student.app.domain.model.Student;
import com.service.ms.student.app.infrastucture.adapters.input.rest.model.request.StudentCreateRequest;
import com.service.ms.student.app.infrastucture.adapters.input.rest.model.response.StudentResponse;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface StudentRestMapper {

    Student toStudent(StudentCreateRequest request);

    StudentResponse toStudentResponse(Student student);

    List<StudentResponse> toStudentResponseList(List<Student> studentList);


}
