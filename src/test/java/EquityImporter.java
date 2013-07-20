import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:/spring-batch.xml")
public class EquityImporter {

    @Autowired
    private JobLauncher jobLauncher;

    @Autowired
    @Qualifier(value = "importJob")
    Job job;

    @Test
    public void testJob() throws Exception{
        JobParametersBuilder builder = new JobParametersBuilder();
        JobExecution jobExecution = jobLauncher.run(job, builder.toJobParameters());
        assertEquals("COMPLETED", jobExecution.getExitStatus().getExitCode());
    }
}
