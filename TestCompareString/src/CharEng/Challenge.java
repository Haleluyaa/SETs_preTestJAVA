package CharEng;

public class Challenge {
	public static void missingLetter(String[]arr) {
		//String engChar [] = new String[26];
		
		String missChar = "Test";
		String fLetter;
		String sLetter;
		int arrLength;
		int indexMaster = 0;
		int indexArr = 0;
		boolean lowCase = false;
		String [] engUpChar = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
		//String [] tempChar;
		if(arr.length < 2)
			System.out.println("please insert more than 2 charactors");
		else 
			for(int i = 0; i <= engUpChar.length-1; i++) {
				if(engUpChar[i].equalsIgnoreCase(arr[0])) {
					String compF = engUpChar[i];
					String compI = arr[0];
					if(!compF.equals(compI)) {
						lowCase = true;
						indexMaster = i;
						break;
					}
				}
			}
					arrLength = arr.length - 1;
					
			do {
				fLetter = engUpChar[indexMaster];
				sLetter = arr[indexArr].toUpperCase();
				if(!fLetter.equals(sLetter))
					if(lowCase == true) {
						missChar = engUpChar[indexMaster].toLowerCase();
						System.out.println(missChar);
						break;
					}else {
						missChar = engUpChar[indexMaster];
						System.out.println(missChar);
						break;
					}
				else {
					indexMaster++;
					indexArr++;
					fLetter = "";
					sLetter = "";
				}
			}while (indexArr <= arrLength);
			

			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
/*						for(int j = indexMaster; j <= arrLength; j++) {
							tempChar[]
						}
							for(int k = 0; k <= arr.length; k++) {
								String fLetter = engUpChar[j];
								String sLetter = arr[k].toUpperCase();
								if(!fLetter.equals(sLetter)) {
									if(lowCase == true) {
										missChar = engUpChar[j].toLowerCase();
										System.out.println(missChar);
										break;
									}else {
										missChar = engUpChar[j];
										System.out.println(missChar);
										break;
									}
								}else {
									break;
								}
							}
							if(!missChar.equals("Test")) {
								break;
							}
						}
				}
				if(!missChar.equals("Test")) {
					break;
				}
				
			}*/
		
		
		
		
		
		
		
		
		 
			
	}

}
