public class Visibility implements Visible {
    private boolean visibility;
    public boolean makeVisible(){
        this.visibility=true;
        return visibility;
    }
    public boolean makeInvisible(){
        this.visibility=false;
        return false;
    }
}
