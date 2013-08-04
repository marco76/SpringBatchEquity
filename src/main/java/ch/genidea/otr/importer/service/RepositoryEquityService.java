package ch.genidea.otr.importer.service;

import ch.genidea.otr.importer.bean.Equity;
import ch.genidea.otr.repositories.EquityImporterRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class RepositoryEquityService implements EquityService{


    @Resource
    private EquityImporterRepository repository;

    @Override
    @Transactional
    public Equity create(Equity equityImporter){
        return repository.save(equityImporter);
    }

}
