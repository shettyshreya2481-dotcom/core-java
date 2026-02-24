class Calculator{
static int add(int a,int b){
return a+b;
}
static int multiply(int a,int b){
return a*b;
}
static int divide(int a,int b){
return a/b;
}

static void math(){
int add=add(3,4);
int multi=multiply(10,7);
int divide=divide(8,8);
System.out.println("Addition:"+add);
System.out.println("Multiplication:"+multi);
System.out.println("Division:"+divide);
}}