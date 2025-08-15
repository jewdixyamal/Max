package ru.ok.android.externcalls.sdk.net.internal;

import kotlin.Metadata;
import org.webrtc.NetworkMonitor;
import ru.ok.android.externcalls.sdk.net.NetworkConnectionManager;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u0018\u0010\u0012\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0014\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168VX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lru/ok/android/externcalls/sdk/net/internal/NetworkConnectionManagerImpl;", "Lru/ok/android/externcalls/sdk/net/NetworkConnectionManager;", "Lpy0;", "call", "<init>", "(Lpy0;)V", "Lqf0;", "callback", "Le5f;", "registerBadConnectionCallback", "(Lqf0;)V", "unregisterBadConnectionCallback", "Ltn9;", "listener", "addNetworkConnectivityListener", "(Ltn9;)V", "removeNetworkConnectivityListener", "Lyxe;", "plusAssign", "(Lyxe;)V", "minusAssign", "Lpy0;", "Lxxe;", "getTopology", "()Lxxe;", "topology", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class NetworkConnectionManagerImpl implements NetworkConnectionManager {
    private final py0 call;

    public NetworkConnectionManagerImpl(py0 py0) {
        this.call = py0;
    }

    public void addNetworkConnectivityListener(tn9 tn9) {
        if (this.call.q1.add(tn9)) {
            NetworkMonitor.isOnline();
            tn9.a();
        }
    }

    public xxe getTopology() {
        return this.call.t1.y();
    }

    public void minusAssign(yxe yxe) {
        this.call.r1.remove(yxe);
    }

    public void plusAssign(yxe yxe) {
        this.call.r1.add(yxe);
    }

    public void registerBadConnectionCallback(qf0 qf0) {
        py0 py0 = this.call;
        if (py0.X0) {
            py0.W0.k.add(qf0);
        } else {
            py0.V0.log("OKRTCCall", "Using registerBadConnectionCallback w/ enableLossRttBadConnectionHandling disabled, ignoring");
        }
    }

    public void removeNetworkConnectivityListener(tn9 tn9) {
        this.call.q1.remove(tn9);
    }

    public void unregisterBadConnectionCallback(qf0 qf0) {
        py0 py0 = this.call;
        if (py0.X0) {
            py0.W0.k.remove(qf0);
        } else {
            py0.V0.log("OKRTCCall", "Using unregisterBadConnectionCallback w/ enableLossRttBadConnectionHandling disabled, ignoring");
        }
    }
}
