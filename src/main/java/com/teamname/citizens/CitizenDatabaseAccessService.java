package com.teamname.citizens;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CitizenDatabaseAccessService implements CitizenDAO {

    private JdbcTemplate jdbcTemplate;

    public CitizenDatabaseAccessService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Citizen> selectAllCitizens() {
        return null;
    }

    @Override
    public Optional<Citizen> selectPersonById() {
        return Optional.empty();
    }

    @Override
    public int insertCitizen(Citizen citizen) {
        return 0;
    }

    @Override
    public int deleteCitizen(int id) {
        return 0;
    }

    @Override
    public int updateCitizen(Citizen citizen) {
        return 0;
    }
}
