/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tigase.socks5.verifiers;

import tigase.kernel.beans.Bean;
import tigase.socks5.Socks5IOService;
import tigase.socks5.Socks5ProxyComponent;
import tigase.socks5.Stream;
import tigase.socks5.VerifierIfc;

/**
 *
 * @author andrzej
 */
@Bean(name = "verifier", parent = Socks5ProxyComponent.class, active = true)
public class DummyVerifier implements VerifierIfc {

        @Override
        public boolean isAllowed(Stream stream) {
                return true;
        }

        @Override
        public void updateTransfer(Socks5IOService service, boolean force) {
        }
        
}
