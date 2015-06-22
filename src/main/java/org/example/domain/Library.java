package org.example.domain;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import javax.xml.bind.annotation.*;
import java.util.List;

@Root(name = "library")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "library")
public class Library
{
  @Attribute(name = "book")
  @ElementList(name = "books")
  @XmlElement(name = "book")
  @XmlElementWrapper(name = "books")
  private List<Book> books;
  @Attribute(name = "name")
  @XmlAttribute(name = "name")
  private String     name;

  public List<Book> getBooks()
  {
    return books;
  }

  public void setBooks(List<Book> books)
  {
    this.books = books;
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }
}
