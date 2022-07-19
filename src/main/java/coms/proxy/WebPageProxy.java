package coms.proxy;

public class WebPageProxy implements Webpage {
    private Webpage webpage;
    public WebPageProxy(){
        webpage=new WebpageImpl();
    }
    public void renderPage (String url) throws Exception{
        if(url.equalsIgnoreCase("www.youtube.coms")){
          throw new Exception("you blocked");
        }
        else {
            webpage.renderPage(url);
        }
    }

}
