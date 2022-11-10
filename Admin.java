public class Admin implements User {

    @Override
    public boolean canRemove() {
        return true;
    }


    @Override
    public boolean canModify() {
        return true;
    }

}