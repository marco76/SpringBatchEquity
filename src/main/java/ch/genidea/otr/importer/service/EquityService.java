package ch.genidea.otr.importer.service;

import ch.genidea.otr.importer.bean.Equity;
import org.springframework.transaction.annotation.Transactional;

public interface EquityService {
    @Transactional
    Equity create(Equity equityImporter);
}
