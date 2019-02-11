public class Printer {

    private int paperQuantity;
    private int tonerVolume;

    public Printer(int paperQuantity){
        this.paperQuantity = paperQuantity;
        this.tonerVolume = 1000;
    }

    public int getPaperQuantity(){
        return this.paperQuantity;
    }

    public void print(int pages, int copies){
        int sheets = pages * copies;
        if (this.paperQuantity >= sheets) {
            this.paperQuantity -= sheets;
            this.tonerVolume -= sheets;
        }
    }

    public void fillPaper(int sheets){
        this.paperQuantity += sheets;
    }

    public int checkTonerVolume(){
        return this.tonerVolume;
    }

    public void refillToner(){
        this.tonerVolume = 1000;
    }

}
