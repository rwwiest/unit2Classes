public class door
{
private String state;
private String name;

public door(String state, String name)
{
    this.state = state;
    this.name = name;
}

public void open()
{
    state = "open";
}

public void close()
{
    state = "close";
}
public String getName()
{
    return this.name;
}
public String getState()
{
    return this.state;
}
public void setName(String newName)
{
    this.name = newName;
}
public void setState(String newState)
{
    this.state = newState;
}
}