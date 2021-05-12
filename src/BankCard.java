import java.util.ArrayList;
import java.util.Objects;

public class BankCard extends BuissnesCard{

    private String bankAccount;
    private static final char BORDER = '$';

    public BankCard(String name, String surname, int phone, String adress, String bankAccount){
        super(name, surname, phone, adress);
        this.bankAccount = bankAccount;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }


    @Override
    public char getBorder() {
        return BORDER;
    }

    @Override
    protected ArrayList<String> getLines() {
        ArrayList<String> lines = super.getLines();
        lines.add("Account number:" + bankAccount);
        return lines;
    }

    // implementacja metody equals oraz hashcode z pomocą InteliJ


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        BankCard bankCard = (BankCard) o;
        return bankAccount.equals(bankCard.bankAccount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), bankAccount);
    }
}
