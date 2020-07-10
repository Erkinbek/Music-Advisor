class Test {

    public static void main(String[] args) {
        new Programmer(1);
    }

    public static class TeamLead {
        public final int numTeamLead;

        public TeamLead(int numTeamLead) {
            this.numTeamLead = numTeamLead;
        }

        public void employ() {
            System.out.println(numTeamLead + " teamlead");
        }

    }

    public static class Programmer extends TeamLead {
        public final int numProgrammer;

        public Programmer(int numProgrammer) {
            super(numProgrammer);
            super.employ();
            this.numProgrammer = numProgrammer;
            employ();

        }

        public void employ() {
            System.out.println(numProgrammer + " programmer");
        }
    }
}