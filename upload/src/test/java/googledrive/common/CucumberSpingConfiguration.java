package googledrive.common;

import googledrive.UploadApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { UploadApplication.class })
public class CucumberSpingConfiguration {}
