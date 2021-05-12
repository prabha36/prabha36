package CheckDetails;

public class SelectionArea {

    public int candidateAge;
    public boolean isHealthIssues = false;


    public  String candidateName = "";
    public String Area = "";

    public SelectionArea(int candidateAge,Boolean isHealthIssues) {
        this.candidateAge = candidateAge;
        this.isHealthIssues = isHealthIssues;
    }

    public boolean checkPersonDetail(){
        PersonDetails personDetails = new PersonDetails();
        PersonDetails details = personDetails.personDetail();

        if(details.isAnyHealthIssues() != isHealthIssues){
            System.out.println("Sorry now,you have to check your health. and try again");
            return false;
        }else if(details.getCandidateAge() < candidateAge){
            System.out.println("Sorry you are not eligible for attending election work");
            return false;
        }else if(!details.isAnyHealthIssues() && details.getCandidateAge() > candidateAge){
            candidateName = details.getCandidateName();
            Area = details.getCandidateAddress();
            System.out.println("Yes have to start the work now!....");
            return true;
        }

        return false;
    }

    public static void main(String[] args){

        SelectionArea selcArea= new SelectionArea(18,false);
        boolean isEligible = selcArea.checkPersonDetail();

        if(isEligible)
        {
            System.out.println("Welcome!!! /n Now you are selected... /n Your name is " + selcArea.candidateName + " , Area name is : " + selcArea.Area);
        }else {
            System.out.println("Sorry you have try later.");
        }
    }

}