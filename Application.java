import java.util.Scanner;
public class Application 
{

	public static void main(String[] args) 
		{	
			Scanner Choice = new Scanner(System.in);
			System.out.println("Enter:\n 0) Encrypt,\n 1) Decrypt, \n 2) EXIT:");
			
			int userChoice = Choice.nextInt();
			
			if(userChoice == 0)
				{
					Scanner userInput = new Scanner(System.in);
					System.out.println("Enter a 4-digit number for Encryption:");
					
					int stayInt = userInput.nextInt();
					userInput.close();

					if(Encrypter.encrypt(stayInt)<1000 && Encrypter.encrypt(stayInt) >= 100)
						{
							System.out.printf("Your number has been Encrypted.\nThe new number is: 0%d",
									Encrypter.encrypt(stayInt));
						}
					else if(Encrypter.encrypt(stayInt)<100 && Encrypter.encrypt(stayInt) >= 10)
						{
							System.out.printf("Your number has been Encrypted.\nThe new number is: 00%d",
									Encrypter.encrypt(stayInt));
						}
					else if(Encrypter.encrypt(stayInt)<10 && Encrypter.encrypt(stayInt) >= 1)
						{
							System.out.printf("Your number has been Encrypted.\nThe new number is: 000%d",
									Encrypter.encrypt(stayInt));
						}
					else
						{
							System.out.printf("Number has been Encrypted.\nThe new number is: %d",
									Encrypter.encrypt(stayInt));
						}
				}
			else if(userChoice == 1) 
				{
					Scanner userInput = new Scanner(System.in);
					System.out.println("Enter a 4-digit number for Decryption:");
					
					int userInt = userInput.nextInt();
					userInput.close();

					if(Decrypter.decrypt(userInt)<1000 && Decrypter.decrypt(userInt) >= 100)
						{
							System.out.printf("It number has been Decrypted.\nYour new number is: 0%d",
									Decrypter.decrypt(userInt));
						}
					else if(Decrypter.decrypt(userInt)<100 && Decrypter.decrypt(userInt) >= 10)
						{
							System.out.printf("It has been Decrypted.\nYour new number is: 00%d",
									Decrypter.decrypt(userInt));
						}
					else if(Decrypter.decrypt(userInt)<10 && Decrypter.decrypt(userInt) >= 1)
						{
							System.out.printf("It number has been Decrypted.\nYour new number is: 000%d",
									Decrypter.decrypt(userInt));
						}
					else
						{
							System.out.printf("It number has been Decrypted.\nYour new number is: %d",
									Decrypter.decrypt(userInt));
						}
				}
			else
			{
				System.out.println("Exiting program Goodbye!");
				Choice.close();
				System.exit(0);
			}
			
		}


	
}