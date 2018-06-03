package pl.sda.poznan.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class TodoItem {
  private Long id;
  private String title;
  private String description;
  private Date startDate;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  @NotNull
  @Size(min = 5, max = 255, message = "Tytuł musi być pomiędzy 5 a 255 znaków")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  @NotNull
  @Size(min = 5, max = 255, message = "Opis musi być pomiędzy 5 a 255 znaków")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Date getStartDate() {
    return startDate;
  }

  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  @Override
  public String toString() {
    return String.format("TodoItem{id=%d, title='%s', description='%s', startDate=%s}", id, title,
        description, startDate);
  }
}
