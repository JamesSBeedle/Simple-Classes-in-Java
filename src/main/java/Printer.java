public class Printer {

    private int sheetsLeft;
    private int tonerVolume;

    public Printer() {
        this.sheetsLeft = 50;
        this.tonerVolume = 15;
    }

    public int getSheetsLeft(){
        return sheetsLeft;
    }

    public void print(int pages, int copies) {
        if (sheetsLeft >= pages * copies){
        sheetsLeft -= pages * copies;
        tonerVolume -= pages * copies;
        }

    }

    public int getTonerVolume() {
        return tonerVolume;
    }


}
