package abstraction3;

public class TestMain {
	    public static void main(String[] args) {
	        Utility utility = new Utility();

	        String lionName = utility.checkForName("Lion");
	        Lion lionObj = utility.getLionObject(lionName);
	        lionObj.displayAll();

	        System.out.println('\n');

	        String giraffeName = utility.checkForName("Giraffe");
	        Giraffe giraffeObj = utility.getGiraffeObject(giraffeName);
	        giraffeObj.displayAll();

	        System.out.println('\n');

	        String bearName = utility.checkForName("Bear");
	        Bear bearObj = utility.getBearObject(bearName);
	        bearObj.displayAll();

	        System.out.println('\n');

	        String bearName2 = utility.checkForName("Bear");
	        Bear bearObj2 = utility.getBearObject(bearName2);
	        bearObj2.displayAll();

	        System.out.println('\n');
	    }
	}

