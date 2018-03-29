package AbilityBuilder;

/**
 * Created by mahadev on 14/2/18.
 */
public class MainApp {
    public static void main(String[] args) {
        PDF pdf=new PDF ();
        pdf.print ();
        PPT ppt=new PPT ();
        ppt.present ();
        ppt.print ();
        TXT txt=new TXT ();
        txt.print ();
        JPG jpg=new JPG ();
        jpg.print ();
        MKV mkv=new MKV ();
        mkv.present ();

    }
}
