package ControlFlow;

class Weeks {
    public static void main(String[] args) {
        int weeks = 3;
        int days = 7;
        for(int i = 1; i <= weeks; ++i) {
            System.out.println("Week: " + i);

            for(int j = 1; j <= days; ++j) {
                if(i == 2) {
                    break;
                }
                System.out.println("  Days: " + j);
            }
        }
    }
}