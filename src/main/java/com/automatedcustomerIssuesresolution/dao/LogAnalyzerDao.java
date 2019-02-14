package com.automatedcustomerIssuesresolution.dao;

import com.automatedcustomerIssuesresolution.model.Log;
import com.automatedcustomerIssuesresolution.model.Rule;
import com.automatedcustomerIssuesresolution.model.SearchCriteria;

import java.util.List;
import java.util.Map;

public interface LogAnalyzerDao {

    public List<Log> getAllLogs();
    public List<Rule> getAllRules();
    public Map<String, String> checkAllRules() throws Exception;
    public List<Log> getLogsWithCriteria(SearchCriteria searchCriteria);

    }
