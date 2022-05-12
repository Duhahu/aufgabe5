package java.de.hfu.residents.repository;

import java.de.hfu.residents.domain.Resident;
import java.util.List;




/**
 * @author Stefan Betermieux
 */
public interface ResidentRepository {

  List<Resident> getResidents();

}