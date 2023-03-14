class Application {

    private NameList nameList;
    private Menu menu;

    public Application() {
        this.nameList = new NameList();
        this.menu = new Menu();
    }

    public void startProgram() {
        boolean isDone = false;

        while (!isDone) {
            menu.showMenu();
            int choise = menu.menuChoise(1,5);

            switch (choise) {
                case 1 -> createPerson();
                case 2 -> nameList.printPeople();
                case 3 -> nameList.updatePerson();
                case 4 -> nameList.deletePerson();
                case 5 -> {
                    System.out.println("Program exits. . .");
                    isDone = true;
                }

            }
        }
    }
    private void createPerson() {
        boolean isDone = false;
        while (!isDone) {
            nameList.createPerson();
            isDone = true;
        }
    }
}