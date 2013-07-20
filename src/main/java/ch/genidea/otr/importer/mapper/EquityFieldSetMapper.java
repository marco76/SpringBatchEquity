package ch.genidea.otr.importer.mapper;

import ch.genidea.otr.importer.bean.EquityImporter;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

public class EquityFieldSetMapper implements FieldSetMapper<EquityImporter> {

    @Override
    public EquityImporter mapFieldSet(FieldSet fieldSet) throws BindException {
        EquityImporter equityImporter = new EquityImporter();
        equityImporter.setSymbol(fieldSet.readString("Symbol"));
        equityImporter.setName(fieldSet.readString("Name"));
        equityImporter.setIpoYear(fieldSet.readString("IPOyear"));
        equityImporter.setSector(fieldSet.readString("Sector"));
        equityImporter.setIndustry(fieldSet.readString("Industry"));
        equityImporter.setSummaryQuote(fieldSet.readString("Summary Quote"));

        return equityImporter;
    }
}
