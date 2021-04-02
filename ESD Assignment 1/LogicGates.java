/* Java program to model logic gates */

class LogicGates{

    public int IC7432 (int in1, int in2) //OR gate
    {
	   int a,b;
	   a = in1;
	   b = in2;
	   int or_ans;
	
	   //using the | operator
	   or_ans = a | b;
	   return or_ans;
    }
	
	public int IC7408 (int in1, int in2) //AND gate
    {
	   int a,b;
	   a = in1;
	   b = in2;
	   int and_ans;
	
	   //using the & operator
	   and_ans = a & b;
	   return and_ans;
    }

    public int IC7404 (int in1) //NOT gate
    {
	   int a;
	   a = in1;
	   int not_ans;
	   
	   if (a == 0)
		   not_ans = 1;
	   else
		   not_ans = 0;
	   
	   return not_ans;
    }

    public static void main(String args[])
	{
       int inp1 = 0, inp2 = 0, inp3 = 1;
	   LogicGates lg = new LogicGates();
	   int result_or_2Input = lg.IC7432(inp1,inp2);
	   int result_or_3Input = result_or_2Input + lg.IC7432(inp2,inp3);
	   int result_and_2Input = lg.IC7408(inp1,inp2);
	   int result_and_3Input = result_and_2Input + lg.IC7408(inp2,inp3);
	   int result_not = lg.IC7404(inp3);
	   System.out.println("Result of 2 input  OR gate : " + result_or_2Input);
       System.out.println("Result of 3 input  OR gate : " + result_or_3Input);
	   System.out.println("Result of 2 input  AND gate : " + result_and_2Input);
       System.out.println("Result of 3 input  AND gate : " + result_and_3Input);
	   System.out.println("Result of NOT gate : " + result_not);
    }
}