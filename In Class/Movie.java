public class Movie {
  private String movieName;
  private int numMinutes;
  private boolean isKidFriendly;
  private int numCastMembers;
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
        this.castMembers[index] = castMemberName;
        return true;
    }
    return false;
  }
  
  //getters
  public String getMovieName() {String S = this.movieName; return S;}
  public int getNumMinutes() {return this.numMinutes;}
  public boolean getIsKidFriendly() {return this.isKidFriendly;}
  public int getNumCastMembers() {return this.numCastMembers;}
  public String[] getCastMembers() {String[] SS = this.castMembers; return SS;}
  
  
  public boolean doArraysMatch(String[] arr1, String[] arr2) {
    if(arr1 == null && arr2 == null) {
        return true;
    }
    else if(arr1 == null || arr2 == null) {
        return false;
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
    String min = "" + this.numMinutes;
    if (this.numMinutes < 100) { min = "0"+min; }
    
    String out = "Movie: [ Minutes "+min+" | Movie Name:"+name+"| ";
    if (this.isKidFriendly) { out += "is kid friendly"; }
    else { out += "not kid friendly"; }
    out += " | Number of Cast Members: "+numCastMembers+" | Cast Members: "+getCastMemberNamesAsString()+" ]";
  }
  
  public boolean equals(Object o) {
    if ((this.movieName != obj.getMovieName())
    || (this.numMinutes != obj.getNumMinutes())
    || (this.isKidFriendly != obj.getIsKidFriendly())
    || (this.numCastMembers != obj.getNumCastMembers())
    || (!(doArraysMatch(this.castMembers,obj.getCastMembers())))
    ) { return false; }
    
    return true; 
  }
  
  public static void main(String[] args) {
    
  }
}
