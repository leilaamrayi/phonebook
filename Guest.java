public class Guest implements User{
    
    @Override
    public boolean canRemove(){
        return false;
    }
    
    
    @Override
    public boolean canModify(){
        return false;
    }
    
}