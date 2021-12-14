import java.util.Scanner;
public class GuessNumber{
    private int _lo, _hi, _guessCtr, _target;
    Scanner sc = new Scanner( System.in );
    
    public GuessNumber ( int a, int b ) {
        _lo = Math.min(a,b);
        _hi = Math.max(a,b);
        _guessCtr = 1;
        _target = ((int)(Math.random()*100)) + 1;
    }
    
    public void playRec() {
        System.out.println(_target);
        System.out.print("Guess a num bt " + _lo + " & " + _hi + ": ");
        int guess = sc.nextInt();
        // 3 cases
        if(guess == _target){
            System.out.println("Correct! It took " + _guessCtr + " guesses");
            return;
        }else if(guess > _target){
            _hi = guess - 1;
        }else{
            _lo = guess + 1;
        }
        _guessCtr++;
        playRec();
        
    }
    
    public void playIter(){
        int guess;
        System.out.println(_target);
        while(true) {
            System.out.print("Guess a num  bt " + _lo + " & " + _hi + ": ");
            guess = sc.nextInt();
            
            //3 cases
            if(guess == _target){
                System.out.println("Correct! It took " + _guessCtr + " guesses");
                return;
            }else if(guess > _target){
                _hi = guess - 1;
            }else{
                _lo = guess + 1;
            }
            
            _guessCtr++;
        }
    }
    
    public void play(){
        //playIter();
        playRec();
    }
    
    public static void main ( String[] args ){
        GuessNumber g = new GuessNumber(1,100);
        g.play();
    }
}
