package com.edigest.journalApp.repositry;
import com.edigest.journalApp.entity.JournalEntry;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface JournalEntryRepository extends MongoRepository <JournalEntry, ObjectId>{

}
