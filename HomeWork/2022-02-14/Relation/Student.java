package kosta.relations2;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private List<Transcript> transcripts;

    //Constructor
    public Student() {}

    public Student(String name) {
        this.name = name;
        transcripts = new ArrayList<>();
    }

    //getters, setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Transcript> getTranscripts() {
        return transcripts;
    }

    public void setTranscripts(List<Transcript> transcripts) {
        this.transcripts = transcripts;
    }

    //학생 객체가 가지고 있는 과목 성적
    public void addTranscript(Transcript transcript) {
        transcripts.add(transcript);
    }

    //수강 과목 가져오기
    public List<Course> getCourses() {
        List<Course> courses = new ArrayList<>();

        for (Transcript transcript : transcripts) {
            courses.add(transcript.getCourse());
        }

        return courses;
    }
}
