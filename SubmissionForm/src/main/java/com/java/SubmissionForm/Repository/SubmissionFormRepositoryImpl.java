package com.java.SubmissionForm.Repository;

import com.java.SubmissionForm.Model.SubmissionForm;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class SubmissionFormRepositoryImpl implements SubmissionFormRepository{

    private Map<String, SubmissionForm> s = new HashMap<>();
    @Override
    public SubmissionForm getSubmission(String id) {
        return s.get(id);
    }

    @Override
    public List<SubmissionForm> getAll() {
        return new ArrayList<>(s.values());
    }

    @Override
    public SubmissionForm addSubmission(SubmissionForm submission) {
        String id = UUID.randomUUID().toString();
        submission.setId(id);

        s.put(id, submission);
        return submission;
    }

    @Override
    public SubmissionForm updateSubmission(SubmissionForm submission) {
        String id = submission.getId();
        if (s.containsKey(id)) {
            s.put(id, submission);
            return submission;
        }
        return null;
    }

    @Override
    public SubmissionForm deleteSubmission(String id) {
        return s.remove(id);
    }
}
