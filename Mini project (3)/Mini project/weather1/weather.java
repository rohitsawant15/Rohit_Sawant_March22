package weather1;
import java.util.*;

//Password for admin mode = admin
//Password for user mode = cdac2022
//Read readme.txt for brief.

class weather{
	
    public static void main(String... args){ //main method
		welcome.msg();
		
		admin m=new admin();//Object of admin class
		
		m.admin();
			
	}
}

