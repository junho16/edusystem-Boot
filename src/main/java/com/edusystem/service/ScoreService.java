package com.edusystem.service;

import com.edusystem.util.ExcelListener.ScoreData;

import java.util.HashMap;
import java.util.Map;

public interface ScoreService {

    public HashMap saveScoreWithHand( Map datamap, String token) ;
    public Boolean saveScoreWithXls(ScoreData datamap, String token);
    public HashMap getScoreData( Map datamap, String token) ;
    public HashMap updateScoreWithHand(Map datamap, String token) ;
    public HashMap getStudentScores(Map datamap, String token) ;
    public HashMap getStudentScoreByTeachtaskid(Map datamap, String token) ;
    public HashMap getStudentScoreForChart(Map datamap, String token) ;
    public HashMap getOwnScoreForChart(Map datamap, String token) ;
}
