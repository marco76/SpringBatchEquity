package ch.genidea.otr.importer;

import ch.genidea.otr.importer.bean.EquityImporter;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.batch.item.ExecutionContext;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class Main {
    public static void main(String args[]){

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"spring-batch.xml"});


        FlatFileItemReader<EquityImporter> itemReader = (FlatFileItemReader<EquityImporter>) context.getBean("symbolItemReader");
        itemReader.setResource(new FileSystemResource("/Users/marco/Documents/test/nyse.csv"));
        itemReader.open(new ExecutionContext());
        JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher");
        JobParametersBuilder parametersBuilder = new JobParametersBuilder();

        Job job = (Job) context.getBean("importEquitySymbolsJob");

        try {
            jobLauncher.run(job,parametersBuilder.toJobParameters());
        } catch (JobExecutionAlreadyRunningException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (JobRestartException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (JobInstanceAlreadyCompleteException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (JobParametersInvalidException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }


    }
}
