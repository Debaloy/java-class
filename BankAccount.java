// Constructor 1 (acc_holder_name, acc_no, init_amnt)
// Constructor 2 (acc_holder_name, acc_no, address, acc_type, curr_amnt)
//
// Methods: Deposit(), Withdraw(), Get_Balance() 

class Account {
	String acc_holder_name, address, acc_type;
	long acc_no;
	double init_amnt, curr_amnt;

	Account (String name, long accNo, double initAmnt) {
		acc_holder_name = name;
		acc_no = accNo;
		init_amnt = initAmnt;
	}

	Account (String name, long accNo, String adrs, String accType, double currAmnt) {
		acc_holder_name = name;
		acc_no = accNo;
		address = adrs;
		acc_type = accType;
		curr_amnt = currAmnt;
	}

	public void Deposit(double amnt) {
		if(init_amnt == 0) {
			init_amnt = amnt;
			curr_amnt += init_amnt;
			System.out.println("Initial and Current Amount: " + curr_amnt);
		}
		if (curr_amnt == 0) {
			curr_amnt = amnt;
			System.out.println("Initial Amount: " + init_amnt);
			System.out.println("Current Amount: " + curr_amnt);
		} else {
			curr_amnt += amnt;
			System.out.println("Initial Amount: " + init_amnt);
			System.out.println("Current Amount: " + curr_amnt);
		}
	}

	public void Withdraw(double amnt) {
		if(amnt > curr_amnt) {			
			System.out.println("Not enough balance\nCurrent Amount: " + curr_amnt);
			return;
		} else {
			curr_amnt -= amnt;
			System.out.println("Amount Left: " + curr_amnt);
		}
	}

	public double Get_Balance() {
		return curr_amnt;
	}

	public void getData(String address, String acc_type, double curr_amnt) {
		System.out.println("Name: " + acc_holder_name);
		System.out.println("Account Number: " + acc_no);
		System.out.println("Address: " + address);
		System.out.println("Account Type: " + acc_type);
		System.out.println("Initial Amount: " + init_amnt);
		System.out.println("Current Amount: " + curr_amnt);
	}
}

class BankAccount {
	public static void main(String args[]) {
		Account a1 = new Account("Debaloy", 2003722459, 1000);
		System.out.println("Balance: " + a1.Get_Balance());
		a1.Deposit(2000);
		a1.getData("E-883, S/F, C.R. Park", "Savings", 1050);
		a1.Withdraw(300);
	}
}
