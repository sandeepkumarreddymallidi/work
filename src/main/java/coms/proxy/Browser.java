package coms.proxy;

public class Browser {
    public static void main(String[] args)  {
        String str= "www.youtube.coms";
        WebPageProxy webPageProxy=new WebPageProxy();
        try {
            webPageProxy.renderPage(str);
        }
        catch (Exception e)
        {
            System.out.println("Exception is occured"+e);
        }

    }
}
