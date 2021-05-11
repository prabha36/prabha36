package CheckDetails;

public class PersonDetails {

    private String candidateName;
    private String candidateAddress;
    private int candidateAge;
    private boolean anyHealthIssues;

    public String getCandidateName() {
        return candidateName;
    }

    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
    }

    public String getCandidateAddress() {
        return candidateAddress;
    }

    public void setCandidateAddress(String candidateAddress) {
        this.candidateAddress = candidateAddress;
    }

    public int getCandidateAge() {
        return candidateAge;
    }

    public void setCandidateAge(int candidateAge) {
        this.candidateAge = candidateAge;
    }

    public boolean isAnyHealthIssues() {
        return anyHealthIssues;
    }

    public void setAnyHealthIssues(boolean anyHealthIssues) {
        this.anyHealthIssues = anyHealthIssues;
    }

    public PersonDetails personDetail(){
        PersonDetails s = new PersonDetails();
        s.setCandidateAddress("Chennai");
        s.setCandidateName("Krish");
        s.setCandidateAge(23);
        s.setAnyHealthIssues(false);
        return s;
    }
}