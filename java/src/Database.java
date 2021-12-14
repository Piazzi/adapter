public class Database {

    IData data;
    DataAdapter adapter;

    public Database() {
        data = new HTMLData();
        adapter = new DataAdapter(data);
    }

    public void setData(String html){
        data.setData(html);
        adapter.htmlToXml();
    }

    public String getData(){
        return adapter.getXmlData();
    }

}
