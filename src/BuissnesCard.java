import java.util.ArrayList;

public class BuissnesCard {

    private static final char BORDER = '*';

    protected String name;
    protected String surname;
    protected int phone;
    protected String adress;

    public BuissnesCard (String name, String surname, int phone, String adress) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.adress = adress;
    }


    public BuissnesCard (String name, String surName) {
        this(name, surName, 123456789, "Krakow");
    }

    public char getBorder() {
        return BORDER;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public int getPhone() {
        return this.phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getAdress() {
        return this.adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }


//    public void print() {
//        ArrayList<String> lines = getLines();
//
//        int maxLength = getMaxLength(lines);
//
//        String starsLine = "";
//        for (int i = 0; i < maxLength + 2; i++) {
//            starsLine += getBorder();
//        }
//
//        System.out.println(starsLine);
//
//        for (String line : lines) {
//            int lengthDiff = maxLength - line.length();
//
//            for (int i = 0; i < lengthDiff; i++) {
//                line += " ";
//            }
//
//            line = getBorder() + line + getBorder();
//
//            System.out.println(line);
//        }
//
//        System.out.println(starsLine);
//    }

    private int getMaxLength(ArrayList<String> lines) {
        int maxLength = 0;

        for (String line : lines) {
            int lineLength = line.length();

            if (lineLength > maxLength) {
                maxLength = lineLength;
            }
        }

        return maxLength;
    }

    protected ArrayList<String> getLines() {
        ArrayList<String> lines = new ArrayList<>();

        lines.add(name + " " + surname);
        lines.add("tel. " + phone + " adres: " + adress);

        return lines;
    }

    // implementacja metody equals oraz hashcode bez "wspomagania" IDE

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        BuissnesCard other = (BuissnesCard) obj;

        return this.name == other.name && this.surname == other.surname && this.phone == other.phone && this.adress == other.adress;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 7;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((surname == null) ? 0 : name.hashCode());
        result = prime * result + ((adress == null) ? 0 : name.hashCode());
        result = prime * result + phone;
        return result;
    }

    @Override
    public String toString() {

        StringBuilder result = new StringBuilder();

        ArrayList<String> lines = getLines();

        int maxLength = getMaxLength(lines);

        String starsLine = "";
        for (int i = 0; i < maxLength + 2; i++) {
            starsLine += getBorder();
        }

        result.append(starsLine + "\n");

        for (String line : lines) {
            int lengthDiff = maxLength - line.length();

            for (int i = 0; i < lengthDiff; i++) {
                line += " ";
            }

            line = getBorder() + line + getBorder();

            result.append(line + "\n");
        }

        result.append(starsLine);

        return result.toString();
    }
}

