package com.example.springfundamental.entity;

import javax.persistence.*;

@Entity
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ticket_id")
    private Integer id;

    private String title;
    private String description;
    private String status;

    @ManyToOne
    @JoinColumn(name="application_id")
    private Application application;

   // ManyToOne
   // @JoinTable(name="ticket_release",joinColumns = @JoinColumn(name="ticket_fk"),inverseJoinColumns = @JoinColumn(name="release_fk"))
    @ManyToOne
   // @JoinColumn(name = "release_id")
    @JoinTable(name="ticket_release",joinColumns = @JoinColumn(name="ticket_fk"),inverseJoinColumns = @JoinColumn(name="release_fk"))
    private Release release;



    public Ticket() {
    }

    public Ticket(Integer id, String title, String description, String status, Application application, Release release) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.status = status;
        this.application = application;
        this.release = release;
    }

    public Ticket(String title, String description, Application application, Release release, String status) {
        this.title = title;
        this.description = description;
        this.application = application;
        this.release = release;
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Application getApplication() {
        return application;
    }

    public void setApplication(Application application) {
        this.application = application;
    }

    public Release getRelease() {
        return release;
    }

    public void setRelease(Release release) {
        this.release = release;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", application=" + application +
                ", release=" + release +
                ", status='" + status + '\'' +
                '}';
    }
}