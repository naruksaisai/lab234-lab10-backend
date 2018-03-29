package camt.se234.lab10.service;

import camt.se234.lab10.entity.Grade;
import org.springframework.stereotype.Service;

@Service
public class GradeServiceImpl implements GradeService {
    @Override
    public String getGrade(double score) {
        if (score >= 80) {
            return "A";
        } else if (score >= 75 && score < 80) {
            return "B";
        } else if (score >= 60 && score < 75) {
            return "C";
        } else if (score >= 33 && score < 60) {
            return "D";
        }
        return "F";

    }
}
