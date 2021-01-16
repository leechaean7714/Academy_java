package com.test04;

public class StarPrn {
	


	
	public void prn01() {
		// ★
		// ★★
		// ★★★
		// ★★★★
		// ★★★★★
		
		// i =줄(0, 1, 2, 3, 4)
		// j = ★,     ★★,    ★★★,    ★★★★,    ★★★★★
		//    (0+1)  (1+1)    (2+1)    (3+1)      (4+1)	
		
		for(int i = 0 ; i < 5 ; i++) {
			
			//큰 for문안에서 별 찍고 공백 찍고
			for(int j = 0; j < i+1; j++) {
				
				System.out.print("★");
			}
				System.out.println();
								
		}
		        
	}
	
	// i = 줄(0, 1, 2, 3, 4)
	// j = ★★★★★, ★★★★,   ★★★,  ★★,    ★
	//     (0+5)    (1+4)    (2+3)  (3+2)  (4+1) ... (5-i)
	
	// ★★★★★
	// ★★★★
	// ★★★
	// ★★
	// ★
	    
	    public void prn02() {
	    	System.out.println();
	    	
    	// i = 줄(0,1,2,3,4)
	    // j = (5-0) (5-1) (5-2) (5-3) (5-4)
	    for(int i = 0 ; i < 5 ; i++) {
	    	for(int j = 0; j <5-i; j++) { //for(int j=5; j > i; j--)
	    		
	    		System.out.print('★');
			}
				
				System.out.println();
	    		
	    	}
	    	
	    }
		
	    //           ★
    	//         ★★
    	//       ★★★
    	//     ★★★★
    	//   ★★★★★
		//i = 줄(0,       1,     2,       3,     4)
	    //j = 공백4별1  공백3별2  공백2별3   공백1별4     공백0별5
	          //(0-4) (1-3)   (2-2)    (3-1)  (4-0)
	    //k =    별1       별2          별3           별4          별5
	

    public void prn03() {
    	System.out.println();
    	
    	for(int i = 0; i < 5 ; i++) {
    		// 공백 (4-0, 4-1, 4-2, 4-3, 4-4)
    		for(int j = 0; j < 4-i  ; j++) {
    	   		System.out.print("    ");
    		}
    		for(int k = 0; k < i+1; k++) {   //j도 쓸 수 있음. 그렇지만 편의상 k로!
    		// ★(1+0, 1+1, 1+2, 1+3, 1+4)	
    			System.out.print("★");	
    		}
    		System.out.println();
    			
    	}
    }


    public void prn04() {
    	//   ★★★★★
    	//     ★★★★
    	//       ★★★
    	//         ★★
    	//           ★
    	System.out.println();
    	for(int i = 0; i < 5; i++) {
    		
    		//공백 (0,0+1,0+2,0+3,0+4)
    		for(int j = 0; j < i; j++) {
    			System.out.print("    ");}
    		for(int k = 0; k < 5-i; k++) {
    		// ★ (5-0, 5-1, 5-2, 5-3, 5-4)
        		System.out.print("★");
    	    }
	System.out.println();
    	}
}

    public void prn05() {
    	//        ★
    	//      ★★★
    	//    ★★★★★
    	//   ★★★★★★★
    	// ★★★★★★★★★
	
    	System.out.println();
    	for(int i = 0; i < 5; i++) {
    		//공백 (4-0, 4-1, 4-2, 4-3, 4-4)
		    for(int j = 0; j < 4-i; j++) {
			    System.out.print("    ");}
		    for(int k = 0; k < (2*i)+1; k++) {
			//★ (2*0+1, 2*1+1, 2*2+1, 2*3+1, 2*4+1)
			    System.out.print("★");
		}
	    System.out.println();
      }
   }
} 
		


