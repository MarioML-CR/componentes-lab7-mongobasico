package com.cenfotec.mongobasico.service;

import com.cenfotec.mongobasico.domain.Journal;
import com.cenfotec.mongobasico.repository.JournalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JournalServiceImpl implements JournalService{

    @Autowired
    JournalRepository journalRepository;

    @Override
    public List<Journal> getAllJournals() {
        return journalRepository.findAll();
    }

    @Override
    public void saveJournal(Journal newJournal) {
        journalRepository.save(newJournal);
    }

    @Override
    public List<Journal> findJournalsByTitle(String title) {
        return journalRepository.findByTitleLike(title);
    }

    @Override
    public void deleteAllJournals() {
        journalRepository.deleteAll();
    }
}
