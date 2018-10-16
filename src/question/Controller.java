package question;

//Import Section
import model.BobTheTrex;
import javax.swing.JOptionPane;
import java.util.arraylist;

public class Controller
{
	/**
	* Builds the instance of the Controller.
	*/
	//Constuctor
	public Controller()
	{
			
	}
	
	/**
	 * This is where the program starts calling methods to run the program.
	 */
	public void start()
	{
		loopy();
	}

	private void loopy()
	{
		boolean isDone = false;
		int count = 0;
		
		while (!isDone)
		{
			JOptionPane.showMessageDialog(null, "brother may I have some looooooooppppsss??????????????");
			count++;
			if (count >= 10)
			{
				for (int loop = 0; loop < 30; loop+= 2)
				{
					JOptionPane.showMessageDialog(null, "the loop value is:  " + loop);
					
				}
				
				
			}
				
				
				isDone = true;
		}
	}

private void askUser()
{ 
	String response = JOptionPane.showInputDialog(null, "how many arms");
	BobTheTrex userBobTheTrex = new BobTheTrex();
	
	
	
}

/*
 * public static void main(String args [])
// java program to illustrate while loop
{
	int x = 1;
	//exit when x becomes greater than 20
	{
		while (x <= 20 )
		{
			System.out.println("Value of x:" + x);
			//increment the value of x for next iteration
			x++;
		}
	}
}
*/

/*
public static void main(String args [])
{
	// for loops begins when x=2 and runs till x <=10
	for (int x = 2; x <=10; x++)
		System.out.println("value of x:" + x);
}
}
*/

/*
public static void main(String args [])
{
	int x = 3;
	do
	{
		// the line will be printed even if the condition is false
		System.out.println("value of x:" + x);
		x++;
		}
	while (x < 20);
}
}
*/

public static void main(String args[])
{
	//infinite loop because condition is not apt
	//condition should have been i>0.
	for (int i = 5; i != 0; i -= 2)
	{
		System.out.println(i);
	}
	int x = 5;
	
	//infinite loop because update statement
	//is not provided
	while (x==5)
	{
		System.out.println("in the loop");
	}
}
}

private void Trex()
{
	// local variables are only visible in the method tehy are defined in!
	// they only SCOPE to that method
	/**
	 * Array list is what is the list and the elements inside
	 */
	ArrayList<Run> myRuns = new ArrayList<Run>();
	
	Run sampleRun = new Run();
	/**
	 * these are the elements being added to the list
	 */
	myRuns.add(sampleRun);
	myRuns.add(sampleRun);
	myRuns.add(otherRun);
	
	
	for (Run current: myRuns)
	{
		current.setName("This run is named" + "da");
	}
	if 
	{
		bet.s
	}
	
	
}







