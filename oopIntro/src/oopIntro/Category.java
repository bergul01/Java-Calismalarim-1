package oopIntro;

public class Category {
	// attribute veya field denilebilir bunlara aşağıdakilere sınıf içinde tanımlananlara 
	int id;
	String name;
	
	public Category() {
		
	}
	
	public Category(int id, String name) {
		
		this.id = id;
		this.name = name;
	}

	public int getId() {      //get giriş okumak için retrun id; şeklinde kullanılır 
		return id;
	}

	public void setId(int id) {		//set çıktı yazmak için (parametre girilir) ve this.id=id şeklinde kullanılır  
		this.id = id;
	}

	public String getName() {
		return name + "!";  //get kısmı ile okunduğunda tüm namelerin önüne ! işareti gelir.
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
}
