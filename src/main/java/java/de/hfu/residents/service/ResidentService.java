package java.de.hfu.residents.service;

import java.de.hfu.residents.domain.Resident;
import java.util.List;

/**
 * @author Stefan Betermieux
 */
public interface ResidentService {

  Resident getUniqueResident(Resident filterResident) throws ResidentServiceException;

  List<Resident> getFilteredResidentsList(Resident filterResident);

}