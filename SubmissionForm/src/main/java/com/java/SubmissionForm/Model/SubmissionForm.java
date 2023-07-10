package com.java.SubmissionForm.Model;

import lombok.Data;

@Data
public class SubmissionForm {
    private String Id;
    private String vendorName;
    private String vendorCompany;

    private String clientName;

    private String leadName;
    private String technology;


    public void setId(String id) {
        this.Id=id;
    }
}
