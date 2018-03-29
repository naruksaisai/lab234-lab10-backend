package camt.se234.lab10.service;

import camt.se234.lab10.entity.Grade;
import org.springframework.stereotype.Service;

@Service
public class GradeServiceImpl implements GradeService {
    @Override
    public String getGrade(double score) {
        String g ="";
        if (score >= 80) {
            g= "A";
        } else if (score >= 75 && score < 80) {
            g= "B";
        } else if (score >= 60 && score < 75) {
            g= "C";
        } else if (score >= 33 && score < 60) {
            g= "D";
        }else if (score < 33) {
            g="F";
        }
        return g;

    }
}
