package com.baronny.form.dto;

import java.time.LocalDate;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class Student {
    @NotNull(message = "Insira um move válido!")
    @NotEmpty(message = "Campo não pode ficar vazio!")
    private String name;

    @NotNull(message = "Escolha o número de Matérias que vai estudar!")
    @Min(value = 4, message = "Escolha no mínimo 4 matérias!")
    @Max(value = 8, message = "Escolha no máximo 4 matérias!")
    private int subjectCount;

    @NotNull
    @Min(1)
    @Max(12)
    private int grade;

    @NotNull
    @Size(max = 10, min = 10, message = "Número do celular deve ter incluir o DDD")
  //  @Pattern(regexp = "[7-9][0-9]{9}", message = "Número inválido!")
    private String mobileNo;

    @NotNull(message = "Insira a data de nascimento")
    @Past(message = "Data de nascimento não pode ser menor que a data atual!")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate birthDate;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSubjectCount() {
        return subjectCount;
    }
    public void setSubjectCount(int subjectCount) {
        this.subjectCount = subjectCount;
    }
    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }
    public String getMobileNo() {
        return mobileNo;
    }
    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }
    public LocalDate getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
    
    
}