package coms.proxy;

public class WebpageImpl implements Webpage {
    public void renderPage(String url) throws Exception {
        System.out.println(url+ " rendered successfully");
    }
}
