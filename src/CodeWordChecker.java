public class CodeWordChecker
{
    private int minimumLength;
    private int maximumLength;
    private String mustNotOccur;

    public CodeWordChecker(int minimumLength, int maximumLength, String mustNotOccur)
    {
        this.minimumLength = minimumLength;
        this.maximumLength = maximumLength;
        this.mustNotOccur = mustNotOccur;
    }

    public CodeWordChecker(String mustNotOccur)
    {
        this.minimumLength = 6;
        this.maximumLength = 20;
        this.mustNotOccur = mustNotOccur;
    }

    public boolean isValid(String codeWord)
    {
        if(codeWord.length() >= minimumLength)
        {
            if(codeWord.length() <= maximumLength)
            {
                if(codeWord.indexOf(mustNotOccur) == -1)
                {
                    return true;
                }
            }
        }
        return false;
    }
}