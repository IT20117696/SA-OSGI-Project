package babyitemspublisher;

public class BabyItemsPublishImpl extends BabyItemsPublish {

	@Override
	public void CalculateAmount(char babyitem_name, int babyitem_type, int quantity, float amount) {
		
		if(babyitem_type == 1)
			System.out.println("Total Payable Amount For Baby Clothing Set is Rs."+(750*quantity)+"\n");
		
		if(babyitem_type == 2)
			System.out.println("Total Payable Amount For Baby Rompers Set is Rs."+(500*quantity)+"\n");
		
		if(babyitem_type == 3)
			System.out.println("Total Payable Amount For Baby Sweaters Set is Rs."+(600*quantity)+"\n");
		
		if(babyitem_type == 4)
			System.out.println("Total Payable Amount For Diaper Covers Set is Rs."+(1250*quantity)+"\n");
		
		if(babyitem_type == 5)
			System.out.println("Total Payable Amount For Unisex Baby Apparel is Rs."+(450*quantity)+"\n");
		
		if(babyitem_type == 6)
			System.out.println("Total Payable Amount For Baby Shampoo is Rs."+(550*quantity)+"\n");
		
	}
}
