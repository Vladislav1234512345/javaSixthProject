package sixthPackage;

public class Main {
    public static void main(String args[]) {
        ScientificBook book1 = new ScientificBook("Andrei lyapin", "JavaScript", -2022, 2021, 8.4);
        ScientificBook book2 = new ScientificBook("Sitnikov Vladislav", "Java", 645, 2023,9.7);
        ScientificBook book3 = new ScientificBook("Matvei Baranov", "Pascal", 452, 2008, 6.3);
        ScientificLibraryHall hall = new ScientificLibraryHall("IT", new ScientificBook[]{book1, book2, book3});
        try{
            System.out.println(hall.getBook(hall.getBooksQty()));
        }
        catch (BookIndexOutOfBoundsException e) {
            System.out.println(e.toString());
        }
        try {
            System.out.println(hall.getGeneralCost());
        }
        catch (InvalidBookPriceException e) {
            System.out.println(e.toString());
        }
        ScientificLibraryHall defaultHall = new ScientificLibraryHall("Не определено", 2);
        ScientificLibrary library = new ScientificLibrary(new ScientificLibraryHall[]{hall, defaultHall});
        try {
            System.out.println(library.getHall(library.getHallsQty()));
        }
        catch (HallIndexOutOfBoundsException e) {
            System.out.println(e.toString());
        }
        try {
            System.out.println(library.getBook(library.getBooksQty()));
        }
        catch(BookIndexOutOfBoundsException e) {
            System.out.println(e.toString());
        }
        try {
            System.out.println(library.getGeneralCost());
        }
        catch(InvalidBookPriceException e) {
            System.out.println(e.toString());
        }
    }
}