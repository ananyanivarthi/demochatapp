public class messages {
    String text;
    String senderid;
    String type;
    long timestamp;
    String currentime;

    public messages (){

    }
    public messages ( String text,String senderid,String type,long timestamp,String currentime)
    {
    this.text = text;
    this.senderid = senderid;
    this.type = type;
    this.timestamp = timestamp;
    this.currentime = currentime;
    }

    public String getText() {

        return text;
    }

    public void setText(String text) {

        this.text = text;
    }

    public String getSenderid() {

        return senderid;
    }

    public void setSenderid(String senderid) {

        this.senderid = senderid;
    }

    public String getType() {

        return type;
    }

    public void setType(String type) {

        this.type = type;
    }

    public long getTimestamp() {

        return timestamp;
    }

    public void setTimestamp(long timestamp) {

        this.timestamp = timestamp;
    }

    public String getCurrentime() {

        return currentime;
    }

    public void setCurrentime(String currentime) {

        this.currentime = currentime;
    }
}
