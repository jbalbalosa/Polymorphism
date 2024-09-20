public class Main {
    public static void main(String[] args) {
        
//        Movie theMovie = new Adventure("Star Wars");
//        Movie theMovie = Movie.getMovie("Science", "Star Wars");
//        theMovie.watchMovie();

        Scanner s = new Scanner(System.in);
        while (true){
            System.out.println("Enter Type (A for Adventure, C for Comedy, " +
                    "S for Science Fiction, or Q for Quit):");
            String type = s.nextLine();
            if("Qq".contains((type))){
                break; //quit the loop
            }
            System.out.println("Enter Movie Title");
            String title = s.nextLine();
            Movie movie = Movie.getMovie(type, title);
            movie.watchMovie();
        }
    }
}
