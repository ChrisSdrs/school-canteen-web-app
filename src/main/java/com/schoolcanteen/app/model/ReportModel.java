package com.schoolcanteen.app.model;

public class ReportModel {

    public Double pendingRepairs;
    public Double inProgressRepairs;
    public Double completedRepairs;

    public ReportModel() {
    }

    public ReportModel(Double pendingRepairs, Double inProgressRepairs, Double completedRepairs) {
        this.pendingRepairs = pendingRepairs;
        this.inProgressRepairs = inProgressRepairs;
        this.completedRepairs = completedRepairs;
    }

    public Double getPendingRepairs() {
        return pendingRepairs;
    }

    public void setPendingRepairs(Double pendingRepairs) {
        this.pendingRepairs = pendingRepairs;
    }

    public Double getInProgressRepairs() {
        return inProgressRepairs;
    }

    public void setInProgressRepairs(Double inProgressRepairs) {
        this.inProgressRepairs = inProgressRepairs;
    }

    public Double getCompletedRepairs() {
        return completedRepairs;
    }

    public void setCompletedRepairs(Double completedRepairs) {
        this.completedRepairs = completedRepairs;
    }
}
