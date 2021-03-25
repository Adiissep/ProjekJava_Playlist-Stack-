package programstack_playlist;
/**
 *
 * @author AD7
 * NAMA : Adi Sepriyadi
 * NIM  : 20200040093
 * Kelas: TI20E Reg B
 * 
 */
public class InvalidLengthException extends Exception
{

    private String lengthSent;

    //Membuat InvalidLengthException dengan Panjang String tidak valid.
    public InvalidLengthException(String inString)
    {
        this.lengthSent = inString;
    }

    //Returns dengan memasukan String pada InvalidLengthException.
    public String getLengthSet()
    {
        return this.lengthSent;
    }

    //Returns InvalidLengthException pada String.
    public String toString()
    {
        String returnString;

        returnString = this.lengthSent + " Ini tidak valid pada lenght!\n";

        return returnString;
    }

}
