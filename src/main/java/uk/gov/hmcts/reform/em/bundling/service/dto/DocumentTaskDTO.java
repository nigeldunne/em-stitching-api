package uk.gov.hmcts.reform.em.bundling.service.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import uk.gov.hmcts.reform.em.bundling.domain.enumeration.TaskState;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the DocumentTask entity.
 */
public class DocumentTaskDTO extends AbstractAuditingDTO implements Serializable {

    private Long id;

    @NotNull
    private String inputDocumentId;

    private String outputDocumentId;

    private TaskState taskState;

    private String failureDescription;

    @JsonIgnore
    private String jwt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInputDocumentId() {
        return inputDocumentId;
    }

    public void setInputDocumentId(String inputDocumentId) {
        this.inputDocumentId = inputDocumentId;
    }

    public String getOutputDocumentId() {
        return outputDocumentId;
    }

    public void setOutputDocumentId(String outputDocumentId) {
        this.outputDocumentId = outputDocumentId;
    }

    public TaskState getTaskState() {
        return taskState;
    }

    public void setTaskState(TaskState taskState) {
        this.taskState = taskState;
    }

    public String getFailureDescription() {
        return failureDescription;
    }

    public void setFailureDescription(String failureDescription) {
        this.failureDescription = failureDescription;
    }

    public String getJwt() {
        return jwt;
    }

    public void setJwt(String jwt) {
        this.jwt = jwt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        DocumentTaskDTO documentTaskDTO = (DocumentTaskDTO) o;
        if (documentTaskDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), documentTaskDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "DocumentTaskDTO{" +
            "id=" + getId() +
            ", inputDocumentId='" + getInputDocumentId() + "'" +
            ", outputDocumentId='" + getOutputDocumentId() + "'" +
            ", taskState='" + getTaskState() + "'" +
            ", failureDescription='" + getFailureDescription() + "'" +
            "}";
    }
}
