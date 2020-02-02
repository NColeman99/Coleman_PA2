public class Decrypter 
	{
	
		public static int decrypt(int encrypt1) 
			{
			
			int d1,d2,d3,d4, decrypt;

			d1 = encrypt1 / 1000;
			d2 = (encrypt1 % 1000) / 100;
		    d3 = (encrypt1 % 100) / 10;
			d4 = encrypt1 % 10;
		 
			d1 = (d1 + 3) % 10;
			d2 = (d2 + 3) % 10;
			d3 = (d3 + 3) % 10;
			d4 = (d4 + 3) % 10;
			
			decrypt = d1 * 1000 + d2 * 100 + d3 * 10 + 2;
			
			return decrypt;
					
			}

	}
