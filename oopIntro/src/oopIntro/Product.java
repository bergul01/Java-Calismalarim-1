package oopIntro;

public class Product {  //Product isimli sınıfımızı oluşturduk.
	
	//encapsulation 
	private int id;			//private sadece bu class üzerinden erişilebilir main kısmında erişilemez o yüzden bu kısımları doldurmak için get ve setlerle erişim sağlarız ve güncelleriz.
	private String name;
	private double unitPrice; //ürün fiyatı
	private String detail;		//ürün açıklaması 
	private double discount;	//indirim oran 
	 							//unitPriceAfterDiscount =indirim oran sonrası ürün fiyatı 
	public Product() { //Product olarak iki tane aynı isimli motot oldu bu olaya owerloading deniliyor aşırıyükleme birisnde parametresiz diğerinde parametreli olarak farkı vardır.
		
		System.out.println("Ben calistim.");  //metotun çalıştığını kontrol etmek için bu çıktıyı verdik yoksa kullanım amacı bu değildir.
	} 
	
	
	public Product(int id , String name , double unitPrice , String detail,double discount) {
		
		this();   //bu gösterim şeklide product kısmının parametresiz olanını bu kısımda da çalıştırıcak(12-15 satırdaki kodlar bu kısımda kullanılcak this(); kullanımıyla.) 
					//this'e şu anlamı yükleyebiliriz bu sınıf
					//this(); bu sınıfın parametresiz olanını çalıştır 
					//this.id=id bu sınıfın id'sini id değerine eşitle 
		
		this.id = id;										
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
		this.discount = discount;
		
		/*this kullanımı ile eşitleme yaparız 
		this şu anlama gelir bu id eşittir , classtaki int id olan veriye
		eşitleme yapmassak product nokta ile main kısmında erişim yapamayız
		Product(constructor) denir.
		main kısmında hangi product imzası var ise o çalışır 
		product1de bu imza vardır o yüzden bu public product(int id,string name,...,...) kısmı çalışır 
		product2 ve product3 kısmında ekrana ben calıstım komutunu yazdırır çünkü imza olarak o kısım kullanıldı
		*/ 
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getUnitPriceAfterDiscount() {
		return this.unitPrice - (this.unitPrice * this.discount / 100); 	//indirimli oranı hesapladık.
	}
	

	
	
}
