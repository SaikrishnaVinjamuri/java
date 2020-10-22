

class Invoice{
        //Define instance variables here
        private String number;
        private String description;
        private int quantity;
        private double price;

        public Invoice(String number ,String description , int quantity ,double price)
        {
            //Define parameterized constructor here
            this.number = number;
            this.description = description;
            this.quantity=quantity;
            this.price= price;
         }
        
       // Setters
        public void setNumber(String number){
             this.number = number;
        }

        public void setDescription(String description){
            this.description=description;
        }

        public void setQuantity(int quantity){
            if(quantity>0){
                this.quantity=quantity;
            }else{
                this.quantity=0;
            }
  
        }
        public void setPrice(double price){
             if(price>0){
                this.price=price;
            }else{
                this.price=0.0;
            }
        }

       // Getters
        public String getNumber(){
            return number;
        }

        public String getDescription(){
            return description;
        }

        public int getQuantity(){
            return quantity;
        }

        public double getPrice(){
            return price;
        }

       public double getInvoiceAmount(){
                 double invoiceAmount = 0.0;
                 // Write your logic here
                 if (quantity<0){
                    invoiceAmount=(int) 0;
                    price = 0 ;
                 }
                 else if (price<0){
                    invoiceAmount=0.0;
                    price = 0.0;
                 }
                 else{
                    invoiceAmount= (quantity*price);
                 }
                return invoiceAmount;
       }
}

public class Experiment1{
         public static void main(String []args){
                 
                   //Write your code here 
                   Invoice myInvoice;
                   myInvoice = new Invoice("2020","HELLO",5,90);
                   System.out.println("Total InvoiceAmount="+myInvoice.getInvoiceAmount());
                   System.out.println("Invoice Number = "+myInvoice.getNumber());
                   System.out.println("Invoice Description = "+ myInvoice.getDescription());
                   System.out.println("Invoice Quantity = " + myInvoice.getQuantity());
                   System.out.println("Invoice Price = " + myInvoice.getPrice());

         }
}
    


