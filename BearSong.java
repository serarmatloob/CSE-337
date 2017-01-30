public class BearSong {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BearSong song = new BearSong();
        song.Ninety_Nine_Bottles_of_Beer();
    }
    
    public void Ninety_Nine_Bottles_of_Beer(){
        for(int i=99;i>0;i--){
            System.out.println(i +" bottles of beer on the wall, "+i+" bottles of beer");
            if(i-1==0){
                System.out.println("take one down, pass it around, no more bottles of beer on the wall.");
            }
            else{
                System.out.println(i-1 +" take one down, pass it around, "+(i-1)+" bottles of beer on the wall.");
            }
            
        }
    }
}
