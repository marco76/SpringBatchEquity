package ch.genidea.otr.importer.processor;

import ch.genidea.otr.importer.bean.EquityImporter;
import org.springframework.batch.item.ItemProcessor;

public class SimpleProcessor implements ItemProcessor<EquityImporter, EquityImporter> {

    @Override
    public EquityImporter process(EquityImporter item) throws Exception {
        return item;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
