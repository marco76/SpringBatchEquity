package ch.genidea.otr.repositories;

import ch.genidea.otr.importer.bean.EquityImporter;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EquityImporterRepository extends JpaRepository<EquityImporter, Long> {

    List<EquityImporter> findBySymbol(String symbol);

}
