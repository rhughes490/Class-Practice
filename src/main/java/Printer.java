public class Printer {
    private int pagesLeft;
    private int tonerLeft;

    public Printer(int pagesLeft, int tonerLeft) {
        this.pagesLeft = pagesLeft;
        this.tonerLeft = tonerLeft;
    }

    public int getPagesLeft() {
        return this.pagesLeft;
    }

    public int getTonerLeft() {
        return this.tonerLeft;
    }

    public void print(int copies, int pages) {
        int pagesToPrint = copies * pages;
        if (this.pagesLeft >= pagesToPrint && this.tonerLeft >= pagesToPrint) {
            this.pagesLeft = pagesLeft - pagesToPrint;
            this.tonerLeft = tonerLeft - pagesToPrint;
        }
    }
}
