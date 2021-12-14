import org.jsoup.Jsoup;

public class DataAdapter extends XMLData {

    private IData htmlData;

    public DataAdapter(IData htmlData) {
        this.htmlData = htmlData;
    }

    public void htmlToXml() {
        String text = Jsoup.parse(this.htmlData.getData()).text();
        this.setXmlData("<?xml version="+1.0+"?> <data>" + text + "</data>");
    }



}
