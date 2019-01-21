/**
 * Tigase Socks5 Component - SOCKS5 proxy component for Tigase
 * Copyright (C) 2011 Tigase, Inc. (office@tigase.com)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, version 3 of the License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. Look for COPYING file in the top folder.
 * If not, see http://www.gnu.org/licenses/.
 */
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tigase.socks5.verifiers;

import java.util.HashMap;
import java.util.Map;
import tigase.socks5.Socks5IOService;
import tigase.socks5.Socks5ProxyComponent;
import tigase.socks5.Stream;
import tigase.socks5.VerifierIfc;

/**
 *
 * @author andrzej
 */
public class DummyVerifier implements VerifierIfc {

        @Override
        public boolean isAllowed(Stream stream) {
                return true;
        }

        @Override
        public void updateTransfer(Socks5IOService service, boolean force) {
        }

        @Override
        public void setProxyComponent(Socks5ProxyComponent proxyComponent) {
                
        }

        @Override
        public Map<String, Object> getDefaults() {
                return new HashMap<String, Object>();
        }

        @Override
        public void setProperties(Map<String, Object> props) {
                
        }
        
}
