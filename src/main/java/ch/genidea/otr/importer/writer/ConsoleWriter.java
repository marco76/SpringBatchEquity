package ch.genidea.otr.importer.writer;

import ch.genidea.otr.importer.bean.Equity;
import org.springframework.batch.item.ItemWriter;

import java.util.List;

public class ConsoleWriter implements ItemWriter<Equity>{

    ItemWriter<Equity> itemWriter;


    @Override
    public void write(List<? extends Equity> list) throws Exception {
        for (Equity object : list){
            System.out.println(object.getSymbol());
        }
    }
}
