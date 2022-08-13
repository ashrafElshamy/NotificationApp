package omege.nofication.view.backing;

import oracle.jdbc.dcn.DatabaseChangeListener;
import oracle.jdbc.dcn.DatabaseChangeRegistration;

public class NotificadorBD {
    public NotificadorBD() {
        super();
    }
    
    private DatabaseChangeRegistration dcr;
        private DatabaseChangeListener dbChangeListener;
        private ProxyDBChangeListener proxyDBChangeListener;

}
