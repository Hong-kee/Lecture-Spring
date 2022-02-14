package kosta.relations2;

import java.util.ArrayList;
import java.util.List;

public class Course {

    private String name;
    private List<Transcript> transcripts;

    //Constructor
    public Course() {}

    public Course(String name) {
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

    //과목 성적 추가 로직
    public void addTranscript(Transcript transcript) {
        transcripts.add(transcript);
    }

    //학생들 성적 추가
    public List<Student> getStudents() {
        List<Student> students = new ArrayList<>();

        for (Transcript transcript : transcripts) {
            students.add(transcript.getStudent());
        }
        return students;
    }
}
