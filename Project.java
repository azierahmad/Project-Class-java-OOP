class Project {
    private String name;
    private String description;
    private double initialCost = 0;
    private static String defaultName = "Default Name";
    private static String defaultDescription = "Default Description";

    //getters and setters!
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public double getInitialCost() {
        return initialCost;
    }
    public void setInitialCost(double initialCost) {
        this.initialCost = initialCost;
    }
    //................................................................
    public String elevatorPitch (){
        return String.format("%s (%02f) %s", name, initialCost, description);
    }
    public Project(String name, String description, double Cost){
        this.name = name;
        this.description = description;
        this.initialCost = Cost;
    }
    public Project(String name){
        this.name = name;
    }
    public Project(){
        name = defaultName;
        description = defaultDescription;
    }
    public Project(String name, String description){
        this.name = name;
        this.description = description;
    }
    
}