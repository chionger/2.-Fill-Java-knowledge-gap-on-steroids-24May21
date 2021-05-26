package template;

public abstract class DataProcessor {

	public void readProessandSave() {
		readData(); //subclass knows of superclass
		processData(); //but superclass has no ideas
		saveData(); // of methods in the subclass
	}
	
	public abstract void readData();
	public abstract void processData();
	
	public void saveData() {
		System.out.println("Save Data to DB. ");
	}	
}