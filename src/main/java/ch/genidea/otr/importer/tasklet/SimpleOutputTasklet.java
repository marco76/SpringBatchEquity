package ch.genidea.otr.importer.tasklet;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

public class SimpleOutputTasklet implements Tasklet {


    @Override
    public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) throws Exception {

        System.out.println("OK");

        return RepeatStatus.FINISHED;
    }
}
