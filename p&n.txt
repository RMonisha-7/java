int i;
		
		if(args.length==0){
			System.out.println("an integer no as argument is excepted");
		}
		i=Integer.parseInt(args[0]);
		if (i>0)
		{
			System.out.println("is a postive no:"+i);
			
		}
		else if (i<0)
		{
			System.out.println("is a negative no:"+i);
			
	
		}
		else if (i==0)
		{
			System.out.println("is neither postive nor negative:"+i);
		}
		
		
