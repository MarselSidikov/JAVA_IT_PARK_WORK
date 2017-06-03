package ru.itpark.dao;

import ru.itpark.models.Auto;

public interface AutosDao extends BaseCrudDao<Auto> {
    int saveForUser(int userId, Auto auto);
}
