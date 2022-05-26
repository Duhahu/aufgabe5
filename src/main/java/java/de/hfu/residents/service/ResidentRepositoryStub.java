package java.de.hfu.residents.service;


import java.de.hfu.residents.domain.Resident;
import java.de.hfu.residents.repository.ResidentRepository;
import java.util.ArrayList;
import java.util.List;

public class ResidentRepositoryStub implements ResidentRepository{

    private List<Resident> residents = new ArrayList<>();

    @Override
    public List<Resident> getResidents() {
        return residents;
    }

    public void addResident(Resident resident) {
        residents.add(resident);
    }

	
	}

	
