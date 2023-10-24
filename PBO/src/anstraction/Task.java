package anstraction;

public interface Task {
    byte normalTypingSpeed = 4;

   default String getName(){
       return "task interface";
   }

    void typing();

    void reporting();
}
