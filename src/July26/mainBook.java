package July26;

public class mainBook {
    public static void main(String[] args) {
        novel novel = new novel();
        novel.author = "ABC";
        novel.novelType = "fiction";
        novel.price = 890.99;
        novel.bookname = "TTT";
        novel.productionCompany ="zzz";
        System.out.println("book details");
        novel.bookDetails();
        fiction fiction = new fiction();
        fiction.author = "smith";
        fiction.price =546.99;
        fiction.productionCompany =  "zoom production";
        fiction.productionYear =1998;

        fiction.novelType  = "Love story";
        System.out.println("Novel details");
        fiction.bookDetails();
        fiction.novelTypeDetails();
        nonFiction nonFiction = new nonFiction();
        nonFiction.author = "Talor";
        nonFiction.price =54.98;
        nonFiction.productionCompany =  "Ss production";
        nonFiction.productionYear =2020;

        nonFiction.novelType  = "Hate story";
        System.out.println("Novel details");
        nonFiction.bookDetails();
        nonFiction.novelTypeDetails();
        



    }

    }

