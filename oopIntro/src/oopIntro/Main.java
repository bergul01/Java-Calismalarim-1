package oopIntro;

public class Main {
	

	public static void main(String[] args) {
		
		Product product1 = new Product(1 , "Lenovo v14" , 15000 , "16 GB Ram",10); 
		//product1'in verilerini bu şekilde girdik bunun için product.java kısmında imza oluşturmamız gerekiyor.
		
		Product product2 = new Product();
		product2.setId(2);
		product2.setName("Lenovo V15");
		product2.setUnitPrice(16000);
		product2.setDetail("32 GB Ram");
		product2.setDiscount(10);
		
		System.out.println(product2.getUnitPriceAfterDiscount()); //indirim sonrası indirim oranını bize verir.
		
		//product2'nin verilerini bu şekilde girdik ve product.java kısmındaki imza olan ben çalıştım komutuyla birlikte çalışır.
		//product2'nin verilerini clasındaki field'ların private olmasından dolayı get ve set metotlarıyla girişlerini sağladık.
		
		
		/*
		Product product3 = new Product();//classımızı oluşturduk product1 (bu olaya referans oluşturma, intance denir.)
		product3.id = 3;
		product3.name = "Hp 5";
		product3.unitPrice = 10000;
		product3.detail = "8 GB Ram";
		
		
		Product[] products = {product1,product2,product3};        //Product veri tipli products dizisini oluşturduk ve elemanıda product tipli olduğu için dizi içerisine ekleme yapabildik
		
		System.out.println(products.length);	//products.length ile dizi içerisindeki eleman sayısını aldık.	

		for (Product product : products) { //product veri tipli ve dizi içinde gezinmeyi sağlicak takma ad olarak product tanımladık ve son olarakta products dizisini geziceğini söyledik	
			System.out.println(product.name);
		}
		*/
	//class'ın kaynaklarını kullanıcağımız zaman onu new'lememiz gerekiyor.


		
		Category category1 = new Category();	//class'ın kaynaklarını kullanıcağımız zaman onu new'lememiz gerekiyor.
	//  veri tipi - örnek ismi = new constructor çalıştırmak için gereken veri tipi 
		category1.setId(1);
		category1.setName("Icecek");
		
		Category category2 = new Category();
		category2.setId(2);						//set kısmı ile yazmak yani güncellemek  
		category2.setName("Yiyecek");			//get kısmı ile okumak
		
		System.out.println(category1.getName());
		System.out.println(category2.getName());
		
		
		ProductManager productManager = new ProductManager(); //bellekte ProductManager türünde bir nesne oluiturduk productManager diye.
		productManager.addToCart(product1); 
		
		productManager.addToCart(product2);
		
		
		
		
		
		 
		
		
		
		
		
	}
	

}

 
