

import com.sun.tools.javac.Main;

public class HttpCookie{
   public static void main(String[] args) {
       
   }
}

 public class HttpCookie implements Cloneable {
 public HttpCookie(String name, String value);
 public boolean hasExpired();
 public void setComment(String comment);
 public String getComment();
 public void setCommentURL(String url);
 public String getCommentURL();
 public void setDiscard(boolean discard);
 public boolean getDiscard();
 public void setPortlist(String ports);
 public String getPortlist();
 public void setDomain(String domain);
 public String getDomain();
 public void setMaxAge(long expiry);
 public long getMaxAge();
 public void setPath(String path);
 public String getPath();
 public void setSecure(boolean flag);
 public boolean getSecure();
 public String getName();
 public void setValue(String value);
 public String getValue();
 public int getVersion();
 public void setVersion(int v);
 public static boolean domainMatches(String domain, String host);
 public static List<HttpCookie> parse(String header);
 public String toString();
 public boolean equals(Object obj);
 public int hashCode();
 public Object clone();
 }