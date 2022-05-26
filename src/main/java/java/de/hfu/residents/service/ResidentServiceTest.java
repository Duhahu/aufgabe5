package java.de.hfu.residents.service;

import java.de.hfu.residents.domain.Resident;
import java.util.Date;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;


public class ResidentServiceTest {
    @SuppressWarnings("unlikely-arg-type")
    
    public void testGetUniqueResident() throws ResidentServiceException {
        Resident resident1 = new Resident("Donald", "Duck", "Magic Straße 1", "Magicland", new Date());
        Resident resident2 = new Resident("Mickey", "Maus", "Disney Straße 2", "Disneyland", new Date());
        Resident resident3 = new Resident("Minie", "Mouse", "Wunder Straße 3", "Wunderland", new Date());
        ResidentRepositoryStub stub = new ResidentRepositoryStub();
        stub.getResidents().add(resident1);
        stub.getResidents().add(resident2);
        stub.getResidents().add(resident3);
        BaseResidentService service = new BaseResidentService();
        service.setResidentRepositoryStub(stub);
        service.getFilteredResidentsList(resident1);
        service.getUniqueResident(resident1);
        service.getFilteredResidentsList(resident2);
        service.getUniqueResident(resident2);
        service.getFilteredResidentsList(resident3);
        service.getUniqueResident(resident3);

        assertThat(resident1.getFamilyName(),is(equals("Duck")));
        assertThat(resident1.getCity(),is(equals("Magicland")));
        assertThat(resident1.getStreet(),is(equals("Magic Straße 1")));
        assertThat(resident2.getGivenName(),is(equals("Mickey")));
        assertThat(resident2.getStreet(),is(equals("Disney Straße 2")));
        assertThat(resident2.getCity(),is(equals("Disneyland")));
        assertThat(resident3.getFamilyName(),is(equals("Mouse")));
        assertThat(resident3.getGivenName(),is(equals("Minie")));
        assertThat(resident3.getCity(),is(equals("Wunderland")));
    }

    
	

	private boolean is(boolean equals) {
        return false;
    }
}