class BankAccountExecutor{
public static void main(String[] sbi){
double amt=BankAccount.getAmount();
System.out.println("Initial Amount:"+amt);
//this statement is used when we declare ref in class file.
BankAccount.amount=80800.5;
double amount=BankAccount.getAmount();
System.out.println("Present Amount:"+amount);
}}
