class BloodData {
   static String bloodType;
   static String rhFactor;
   
    public BloodData() {
        bloodType = "0";
        rhFactor = "+";     
    }
    public BloodData(String bt, String rh) {
       bloodType = bt;
       rhFactor = rh;       
    }
        public void display(){
        System.out.print(this.bloodType + this.rhFactor);
        System.out.println(" is added to the blood bank"); 
    }    
       
    
}
    
