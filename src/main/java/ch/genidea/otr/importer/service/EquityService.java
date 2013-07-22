package ch.genidea.otr.importer.service;

import ch.genidea.otr.importer.bean.EquityImporter;
import org.springframework.transaction.annotation.Transactional;

public interface EquityService {
    @Transactional
    EquityImporter create(EquityImporter equityImporter);
}
