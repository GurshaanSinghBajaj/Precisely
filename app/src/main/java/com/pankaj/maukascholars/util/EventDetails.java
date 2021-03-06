package com.pankaj.maukascholars.util;

/**
 * Project Name: 	<Visual Perception For The Visually Impaired>
 * Author List: 		Pankaj Baranwal
 * Filename: 		<>
 * Functions: 		<>
 * Global Variables:	<>
 */
public class EventDetails {
    private int id = 0;
    private int starred = 0;
    private int saved = 0;
    private String title = "IIDA Student Design Competition";
    private String description = "The Student Design Competition celebrates original design and rewards individuals and/or teams whose projects demonstrate innovative, functional design solutions that have a positive environmental and human impact, while allowing emerging professionals the opportunity to showcase their work and fresh design ideas to professionals working in the field.";
    private String name = "Curated by Spot-on Opportunities";
    private String deadline = "Deadline: 5 February, 2018";
    private String image;
    private String icon;
    private String link = "http://www.iida.org/content.cfm/student-design-competition";

    public EventDetails(){

    }

    public EventDetails(int id, int starred, int saved, String title, String description, String deadline, String name, String image, String icon, String link){
        this.starred = starred;
        this.saved = saved;
        this.id = id;
        this.title = title;
        this.deadline = deadline;
        this.description = description;
        this.name = name;
        this.deadline = deadline;
        this.image = image;
        this.icon = icon;
        this.link = link;
    }

    public EventDetails(int id, String title, String description, String deadline, String name, String image, String icon, String link){
        this.id = id;
        this.title = title;
        this.deadline = deadline;
        this.description = description;
        this.name = name;
        this.deadline = deadline;
        this.image = image;
        this.icon = icon;
        this.link = link;
    }

    public int getId() {
        return id;
    }

    public String getDeadline() {
        return deadline;
    }

    public String getDescription() {
        return description;
    }

    public String getIcon() {
        return icon;
    }

    public String getImage() {
        return image;
    }

    public String getLink() {
        return link;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public int getSaved() {
        return saved;
    }

    public int getStarred() {
        return starred;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSaved(int saved) {
        this.saved = saved;
    }

    public void setStarred(int starred) {
        this.starred = starred;
    }
}
