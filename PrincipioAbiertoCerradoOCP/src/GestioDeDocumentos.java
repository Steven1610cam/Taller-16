
interface Exportable {
    String exportar();
}


class DocumentoPDF implements Exportable {
    private String contenido;

    public DocumentoPDF(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public String exportar() {
        return "Exportando documento a PDF: " + contenido;
    }
}


class DocumentoWord implements Exportable {
    private String contenido;

    public DocumentoWord(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public String exportar() {
        return "Exportando documento a Word: " + contenido;
    }
}


class DocumentoExcel implements Exportable {
    private String contenido;

    public DocumentoExcel(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public String exportar() {
        return "Exportando documento a Excel: " + contenido;
    }
}


public class GestioDeDocumentos {
    public static void main(String[] args) {
        
        Exportable documentoPDF = new DocumentoPDF("Contenido del documento PDF");
        System.out.println(documentoPDF.exportar());

        
        Exportable documentoWord = new DocumentoWord("Contenido del documento Word");
        System.out.println(documentoWord.exportar());

        
        Exportable documentoExcel = new DocumentoExcel("Contenido del documento Excel");
        System.out.println(documentoExcel.exportar());
    }
}