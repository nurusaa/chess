
/**
 * Enumeration class ChessType - write a description of the enum class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public enum ChessType
{
    KING ("k"), QUEEN("q"), ROOK("r"), BISHOP("b"), KNIGHT("n"), PAWN("p");
    
    private String value;
    
    ChessType(String value)
    {
        this.value = value;
    }
    
    public String toString()
    {
        return this.value;
    }
    
    public static ChessType fromString (String value)
    {
        for (ChessType piece: ChessType.values())
        {
            if (piece.value.equalsIgnoreCase(value))
            {
                return piece;
            }
        }
        return null;
    }
}
