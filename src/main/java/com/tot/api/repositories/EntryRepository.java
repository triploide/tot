package com.tot.api.repositories;

import com.tot.api.models.Entry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntryRepository extends JpaRepository <Entry, Long> {
}
