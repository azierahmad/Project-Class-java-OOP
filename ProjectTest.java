public class ProjectTest {
    public static void main(String[] args) {
        // Project test = new Project("ahmad");
        // Project all = new Project("ali", "hey all", 10.9);

        // String name = test.getName();
        // String sName = all.getName();
        // String description = all.getDescription();
        // double initialCost = all.getInitialCost();
        
        // System.out.println("the name is: " + name);
        // System.out.println("-----------------------");
        // System.out.println("the name  is: " +sName + ", the cost is: " + initialCost+ ",the description is: " + description);
        
        
        //now i Created four Projects in the four different ways!
        Project project = new Project();
        Project firstProject = new Project("ahmad");
        Project secondProject = new Project("Ali", "Hey all");
        Project thirdProject = new Project("Montaser", "Hey all", 10.9);

        //now i will create portfolio!
        Portfolio portfolio = new Portfolio();

        //and now i will set name, initialCost and the description of the firstProjecti had created!
        project.setName("this is the first project");
        project.setInitialCost(355.9);
        project.setDescription("hey all i'm azier ahmad");

        // Print the name, cost and description of secondProject!
        // System.out.println(secondProject.getName());
        // System.out.println(secondProject.getInitialCost());
        // System.out.println(secondProject.getDescription());

        // Add all four projects to the portfolio!
        portfolio.addProject(project);
        portfolio.addProject(firstProject);
        portfolio.addProject(secondProject);
        portfolio.addProject(thirdProject);

        //here it will print all the four projects and the total cost was saved into the portfolio ArrayList!
        portfolio.showPortfolio();
    }
}
