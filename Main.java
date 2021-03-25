package programstack_playlist;
/**
 *
 * @author AD7
 * NAMA : Adi Sepriyadi
 * NIM  : 20200040093
 * Kelas: TI20E Reg B
 * 
 */
import java.io.*;//tempat impor
import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main( String[] arg)
    {
        Menu menu = new Menu();

        menu.loadPlaylist(); 
        menu.runMenu();

    }

}
