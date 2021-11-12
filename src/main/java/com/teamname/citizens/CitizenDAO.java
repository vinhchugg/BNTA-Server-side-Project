package com.teamname.citizens;

import java.util.List;
import java.util.Optional;

public interface CitizenDAO {
    List<Citizen> selectAllCitizens();
    Optional<Citizen> selectCitizenById(Integer id);
    int insertCitizen(Citizen citizen);
    int deleteCitizen(int id);
    int updateCitizen(Integer id, Citizen citizen);
    int updateCitizen(Integer id, Integer house_id);
}
