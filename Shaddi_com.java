import java.util.Scanner;
class Shaddi_com
{	
	static Scanner sc=new Scanner(System.in);
	static Page1 page=new Page1();
	public static void main(String[] args) 
	{
		boolean flag=true;
		while(flag)
		{
			System.out.println("1.SignUp \n2.LogIn \n3.Exit \nChoose Any Opction");
			System.out.println("--------------------------------------------------");
			switch(sc.nextInt())
			{
				case 1:
				{
					System.out.println("Enter The Name :");
					String name=sc.next();
					System.out.println("Enter The Age :");
					int age=sc.nextInt();
					System.out.println("Gender :");
					String gender=sc.next();
					System.out.println("Enter 3 Digit Passward :");
					int pwd=sc.nextInt();
					page.signUp(name,age,gender,pwd);
					System.out.println("--------------------------------------------");
				}break;
				case 2:
				{
					System.out.println("Enter THe Name :");
					String n=sc.next();
					System.out.println("Enter 3 Digit Passward :");
					int pw=sc.nextInt();
					page.logIn(n,pw);
					System.out.println("--------------------------------------------");
				}break;
				case 3:
				{
					flag=false;
					System.out.println("Thank You.......!!!!");
					System.out.println("--------------------------------------------");

				}break;
				default:
				{
					System.out.println("Invalid Opction....");
					System.out.println("--------------------------------------------");
				}
			}
		}
	}
}

class Page1
{
	static Scanner sc=new Scanner(System.in);
	String name;
	int age;
	String gender;
	int pwd;
	long salary;
	String address;
	long phno;

	void signUp(String n,int a,String g,int p)
	{
		if(a>21)
		{
			name=n;
			age=a;
			gender=g;
			pwd=p;
			System.out.println("Sign Up is Done.....!!!");
		}
		else
		{
			System.out.println("Grow up Beta....!!!");
		}
	}

	void update(long x,String y,long z)
	{
		salary=x;
		address=y;
		phno=z;
		System.out.println("Update Is Done....!!");
	}

	void changePwd(int w)
	{
		if(pwd==w)
		{
			System.out.println("Enter New Passward :");
			int newpwd=sc.nextInt();
			pwd=newpwd;
			System.out.println("Done.....!!!");
		}
		else
		{
			System.out.println("Invalid PassWard..");
		}
	}

	void logIn(String s,int b)
	{
		boolean flag=true;
		
		
			if(s.equals(name) && b==pwd)
			{	while(flag)
				{
				System.out.println("------------------------------------------------");
				System.out.println("1.Update Page \n2.View Page \n3.Change PassWard \n4.Exit \n Choose One Opction.....");
				System.out.println("------------------------------------------------");
				int a=sc.nextInt();
				switch(a)
				{
					case 1:
					{
						System.out.println("Enter Salary");
						long sal=sc.nextLong();
						System.out.println("Enter Address");
						String add=sc.next();
						System.out.println("Phone no");
						long ph=sc.nextLong();
						update(sal,add,ph);
						System.out.println("--------------------------------------------");
					}break;
					case 2:
					{
						System.out.println("Name :"+name);
						System.out.println("Age :"+age);
						System.out.println("Gender :"+gender);
						System.out.println("Salary :"+salary);
						System.out.println("Address :"+address);
						System.out.println("Phone No :"+phno);
						if(salary>50000)
						{
							System.out.println("Profile Level Is Premium");
							System.out.println("------------------------------------------------");
						}
						else
						{
							System.out.println("Profile Is Regular");
							System.out.println("------------------------------------------------");
						}
					}break;
					case 3:
					{
						System.out.println("Enter Old Passward :");
						int passward=sc.nextInt();
						changePwd(passward);
						System.out.println("------------------------------------------------");
			
						/*if(pwd == passward)
						{
						System.out.println("Enter new Passward :");
						int newpassward=sc.nextInt();
						pwd=newpassward;
						System.out.println("Done..!");
						}
						else
						{
						System.out.println("Enter  correct password :");
						System.out.println("--------------------------------------------");
						}*/
						
					}break;
					case 4:
					{
						System.out.println("Thank You For visiting Home Page.....!!!");
						flag=false;
						System.out.println("--------------------------------------------");
					}break;
					default:
					{
						System.out.println("Invalid Opction.....");
						System.out.println("--------------------------------------------");
					}

				}
			}}
			else
			{	flag=false;
				System.out.println("wrong pwd");
				System.out.println("------------------------------------------------");
			}
		
				
	}
}