package ch.genidea.otr.importer.writer;

import ch.genidea.otr.importer.bean.EquityImporter;
import org.springframework.batch.item.ItemWriter;

import java.util.List;

public class ConsoleWriter implements ItemWriter<EquityImporter>{

    ItemWriter<EquityImporter> itemWriter;


    @Override
    public void write(List<? extends EquityImporter> list) throws Exception {
        for (EquityImporter object : list){
            System.out.println(object.getSymbol());
        }
    }
}
