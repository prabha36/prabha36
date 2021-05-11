package CheckDetails;

public class SelectionArea {
    //global Variable init
    public int candidateAge;
    private boolean isHealthIssues = false;


    public  String candidateName = "";
    private String Area = "";

    public SelectionArea(int candidateAge,Boolean isHealth) {
        this.candidateAge = candidateAge;
        this.isHealthIssues = isHealth;
    }

    public boolean checkPersonDetail(){
        PersonDetails personDetails = new PersonDetails();
        PersonDetails personDetail = personDetails.personDetail();


        if(personDetail.isAnyHealthIssues() != isHealthIssues){
            System.out.println("Sorry now,you have to check you health. and try again");
            return false;
        }else if(personDetail.getCandidateAge() < candidateAge){
            System.out.println("Sorry you are not eligible for attending election work");
            return false;
        }else if(!personDetail.isAnyHealthIssues() && personDetail.getCandidateAge() > candidateAge){
            candidateName = personDetail.getCandidateName();
            Area = personDetail.getCandidateAddress();
            System.out.println("Yes have to start the work now!....");
            return true;
        }


        return false;
    }

    public static void main(String[] args){

        SelectionArea selcArea= new SelectionArea(18,true);
        boolean isEligible = selcArea.checkPersonDetail();

        if(isEligible)
        {
            System.out.println("Welcome!!! /n Now you are selected... /n Your name is " + selcArea.candidateName + " , Area name is : " + selcArea.Area);
        }else {
            System.out.println("Sorry you have try later.");
        }

    }

}