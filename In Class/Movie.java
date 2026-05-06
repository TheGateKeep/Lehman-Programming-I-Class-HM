public class Movie {
  private String movieName;
  private int numMinutes;
  private boolean isKidFriendly;
  private int numCastMembers
  private String[] castMembers;
  
  public Movie(String movieName, int numMinutes, boolean isKidFriendly, String[] castMembers) {
    this.movieName = movieName;
    this.numMinutes = numMinutes;
    this.isKidFriendly = isKidFriendly;
    this.numCastMembers = castMembers.length;
    this.castMembers = castMembers;
  }
  
  public Movie() {
    this.movieName = "Flick";
    this.numMinutes = 0;
    this.isKidFriendly = false;
    this.numCastMembers = 0;
    this.castMembers = new String[10];
  }
  
  //setters
  public void setmovieName(String name) { this.movieName = name; }
  public void setisKidFriendly(boolean friendly) { this.isKidFriendly = friendly; }
  public void setnumMinutes(int numM) { this.numMinutes = numM; }
  
  public boolean replaceCastMember(int index, String castMemberName) {
    if(index < this.castMembers.length) {
        this.castMembers = castMemberName;
        return true;
    }
    return false;
  }
  
  //getters
  public String getMovieName() {String S = this.MovieName; return S;}
  public int getNumMinutes() {return this.NumMinutes;}
  public boolean getMovieName() {return this.MovieName;}
  public int getNumCastMembers() {return this.NumCastMembers;}
  public String[] getCastMembers() {String[] S = this.CastMembers; return SS;}
  
  
  public boolean doArraysMatch(String[] arr1, String[] arr2) {
    if(arr1 == null && arr2 == null) {
        returns true;
    }
    else if(arr1 == null || arr2 == null) {
        returns false;
    }
    if(arr1.length != arr2.length) {
        return false;
    }
    
    for(int i = 0; i < arr1.length; i++) {
        if(arr1[i] != arr2[i]) {
            return false;
        }
    }
    return true;
  }
  
  public String getCastMemberNamesAsString() {
    if(numCastMembers == 0) { return "none"; }
    
    String out = "";
    int l = this.castMembers.length;
    
    for(int i = 0; i < l; i++) {
        out += castMembers[i];
        if(!(i == l-1)) {
            out += ", ";
        }
    }
    return out;
  }
  
  public String toString() {
    String name = String.format(movieName+"%20");
    //do thing here to pad a 0 to minutes if not 3 digits
  }
  
  public static void main(String[] args) {
    
  }
}
