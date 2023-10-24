package classdanobject;

//Declaring class
class DenahRumah {
   //Declaring Fields
   int harga;
   int luasTanah = 300;

   // Declaring construktor
   DenahRumah(){
      System.out.println("Sebuah object dibuat dari class denah rumah");
   }

   // Parameterized construktur
   DenahRumah(int harga, int luasTanah) {
      this.harga = harga;
      this.luasTanah = luasTanah;
   }

   // Constraktor Overloading
   DenahRumah(int harga) {
      this.harga = harga;
   }

   // Declaring method
   float hargaDiskon(int diskon){
      return harga - (harga * diskon/100);
   }

   // Method overloading
   float hargaDiskon() {
      return harga - (harga * 10 / 100);
   }

}
