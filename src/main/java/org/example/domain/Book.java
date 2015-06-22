package org.example.domain;

import org.simpleframework.xml.Attribute;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

@XmlAccessorType(XmlAccessType.FIELD)
public class Book
{
  @Attribute(name = "author")
  @XmlAttribute(name = "author")
  private String author;
  @Attribute(name = "edition")
  @XmlAttribute(name = "edition")
  private String edition;
  @Attribute(name = "format")
  @XmlAttribute(name = "format")
  private String format;
  @Attribute(name = "isbn")
  @XmlAttribute(name = "isbn")
  private String isbn;
  @Attribute(name = "language")
  @XmlAttribute(name = "language")
  private String language;
  @Attribute(name = "pages")
  @XmlAttribute(name = "pages")
  private int    pages;
  @Attribute(name = "publisher")
  @XmlAttribute(name = "publisher")
  private String publisher;
  @Attribute(name = "title")
  @XmlAttribute(name = "title")
  private String title;

  public String getAuthor()
  {
    return author;
  }

  public void setAuthor(String author)
  {
    this.author = author;
  }

  public String getEdition()
  {
    return edition;
  }

  public void setEdition(String edition)
  {
    this.edition = edition;
  }

  public String getFormat()
  {
    return format;
  }

  public void setFormat(String format)
  {
    this.format = format;
  }

  public String getIsbn()
  {
    return isbn;
  }

  public void setIsbn(String isbn)
  {
    this.isbn = isbn;
  }

  public String getLanguage()
  {
    return language;
  }

  public void setLanguage(String language)
  {
    this.language = language;
  }

  public int getPages()
  {
    return pages;
  }

  public void setPages(int pages)
  {
    this.pages = pages;
  }

  public String getPublisher()
  {
    return publisher;
  }

  public void setPublisher(String publisher)
  {
    this.publisher = publisher;
  }

  public String getTitle()
  {
    return title;
  }

  public void setTitle(String title)
  {
    this.title = title;
  }
}
