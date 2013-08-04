package ch.genidea.otr.importer.processor;

import ch.genidea.otr.importer.bean.Equity;
import org.springframework.batch.item.ItemProcessor;

public class SimpleProcessor implements ItemProcessor<Equity, Equity> {

    @Override
    public Equity process(Equity item) throws Exception {
        return item;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
