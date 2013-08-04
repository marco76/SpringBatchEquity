package ch.genidea.otr.repositories;

import ch.genidea.otr.importer.bean.Equity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EquityImporterRepository extends CrudRepository<Equity, Long> {

    public Equity findBySymbol(String symbol);

    @Query("select e from equities as e where e.excludedFromShowing = true or e.excludedFromShowing is null and e.optionsFound = true")
    public List<Equity> findEquitiesForOptions();


}
