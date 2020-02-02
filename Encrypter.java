public class Encrypter 
{
	/*Encrypter seperates the userInt,Adds 7 to each digit,divides individual by 10. 
	 / *swaps the (d1,d3) and the (d2,d4)*/
	public static int encrypt(int stayInt)
		{
		 
		int d1,d2,d3,d4;
		int encrypt2;
		
			d1	=	stayInt/1000;
			d2	=	(stayInt%1000)/100;
			d3	=	(stayInt%100)/10;
			d4	=	stayInt%10;		
	
			d1	=	(d1 + 7)%10;
			d2	=	(d2 + 7)%10;
			d3	=	(d3 + 7)%10;
		    d4	=	(d4 + 7)%10;
			
			encrypt2 = ((d1*1000) + (d2*100) + (d3*10) + 2);
			return encrypt2;
		}
}
