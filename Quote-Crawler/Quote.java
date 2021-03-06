
public class Quote {

    public String subject;          // the person (or thing) that the text is about
    public String speaker;          // the person (or entity) that is delivering the text
    public String text;             // the text itself
    public String source;           // url to the page that contains the text
    public String pagetitle;         // title of the page the quote came from
    public double sentiment;        // sentiment rating for the quote

    public Quote(String source, String speaker, String subject, String text, double positive_prob, String pagetitle){
        this.subject = subject;
        this.speaker = speaker;
        this.text = text;
        this.source = source;
        this.pagetitle = pagetitle;
        this.sentiment = positive_prob;
    }

    public String toString(){
        String output = "";

        output += "\nQUOTE TEXT: " + "“" + this.text + "”";
        output += "\nQUOTE SUBJECT: " + this.subject;
        output += "\nQUOTE SPEAKER: " + this.speaker;
        output += "\nQUOTE SENTIMENT: " + this.sentiment;
        output += "\nQUOTE PAGETITLE: " + this.pagetitle;
        output += "\nQUOTE SOURCE: " + this.source;

        return output;
    }


    public String toHTML(){
        String output = "<html><head><title>" + this.speaker + "</title></head><body>";

        output += "<p class='quotetext'>" + this.text + "</p>";
        output += "<p class='quotespeaker'>" + this.speaker + "</p>";
        output += "<p class='quotesubject'>" + this.subject + "</p>";
        output += "<p class='quotesentiment'>" + this.sentiment + "</p>";
        output += "<p class='quotepagetitle'>" + this.pagetitle + "</p>";
        output += "<p class='quotesource'>" + this.source + "</p>";

        output += "</body></html>";

        return output;
    }



}
