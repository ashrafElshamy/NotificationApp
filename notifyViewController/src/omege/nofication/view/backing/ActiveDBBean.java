package omege.nofication.view.backing;

import java.util.Collection;

import javax.annotation.PostConstruct;

import oracle.adf.view.rich.activedata.ActiveModelContext;
import oracle.adf.view.rich.activedata.BaseActiveDataModel;

public class ActiveDBBean extends BaseActiveDataModel implements ProxyDBChangeListener{
    public ActiveDBBean() {
        super();
    }
    
    @PostConstruct
    public void setupActiveData() {
        ActiveModelContext vActiveModelContext = ActiveModelContext.getActiveModelContext();
        Object[] vKeyPath = new String[0];
        vActiveModelContext.addActiveModelInfo(this, vKeyPath, "currentChanges");
    }

    @Override
    protected void startActiveData(Collection<Object> collection, int i) {
        System.out.println("start active ");

    }

    @Override
    protected void stopActiveData(Collection<Object> collection) {
        // TODO Implement this method
    }

    @Override
    public int getCurrentChangeCount() {
        // TODO Implement this method
        return 0;
    }

    @Override
    public void onDatabaseChangeNotification() {
        // TODO Implement this method
    }
}
