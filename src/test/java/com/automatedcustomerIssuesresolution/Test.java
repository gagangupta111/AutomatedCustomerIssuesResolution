package com.automatedcustomerIssuesresolution;

import com.automatedcustomerIssuesresolution.dao.LogAnalyzerDaoImpl;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.DefaultApplicationArguments;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
@SpringBootTest(classes = {Test.class})
@ContextConfiguration(classes = {AutomatedCustomerIssuesResolution.class})
public class Test {

    @Spy
    private LogAnalyzerDaoImpl logAnalyzerDao;

    @Before
    public void initMocks(){
        MockitoAnnotations.initMocks(this);
    }

    @org.junit.Test
    public void testLogs(){

        String[] args = {"D://gagan.gupta//IntellijIdeaProjects//AutomatedCustomerIssuesResolution//Sample//CS-12345", "2019-Jan-19", "Sat", "02:30:37.549",  "30000"};
        ApplicationArguments appArgs = new DefaultApplicationArguments(args);

    }
}
