package TicTacToe;
//Requirement -> 2 player and  3*3 Boart
// Game class and Main class
public class Player
{
    private String name;
    private char symbol;

    public void setName(String name)
    {
        this.name=name;
    }
    public void setSymbol(char symbol)
    {
        this.symbol=symbol;
    }

    public String getName()
    {
        return this.name;
    }
    public char getSymbol()
    {
        return this.symbol;
    }


}
