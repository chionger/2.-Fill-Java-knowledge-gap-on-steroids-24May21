package template;

public class TestTemplate {

	public static void main(String[] args) {
		DataProcessor obj=new Excelfile();
		obj.readProessandSave();
//		obj.readData();
//		obj.processData();
//		obj.saveData();
		
		obj=new Textfile();
		obj.readProessandSave();
//		obj1.readData();
//		obj1.processData();
//		obj1.saveData();
	}
}
