package defpackage;

import android.os.Handler;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.PeerConnection;

/* renamed from: ik4  reason: default package */
public final /* synthetic */ class ik4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kk4 b;

    public /* synthetic */ ik4(kk4 kk4, int i) {
        this.a = i;
        this.b = kk4;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                kk4 kk4 = this.b;
                for (nsa nsa : kk4.K0.values()) {
                    kk4.Z(nsa, nsa.C());
                }
                return;
            default:
                kk4 kk42 = this.b;
                if (kk42.I()) {
                    for (Map.Entry entry : kk42.K0.entrySet()) {
                        bg1 bg1 = (bg1) entry.getKey();
                        if (((nsa) entry.getValue()).C() != PeerConnection.IceConnectionState.CONNECTED) {
                            fg1 z = kk42.z(bg1);
                            kk42.b = true;
                            jb9.d(kk42.X, "DIRECT_CONNECTION_TIMEOUT", z != null ? z.k : null);
                            xn1 xn1 = kk42.y0;
                            if (xn1 != null) {
                                py0 py0 = (py0) xn1;
                                if (kk42.H(xxe.b)) {
                                    py0.V0.log("OKRTCCall", "onTopologyUpgradeProposed");
                                    rod rod = py0.Z;
                                    ka6 b2 = f46.b((JSONObject) null, "switch-topology");
                                    JSONObject jSONObject = b2.a;
                                    try {
                                        jSONObject.put("topology", (Object) "SERVER");
                                        jSONObject.put("force", false);
                                    } catch (JSONException e) {
                                        e.printStackTrace();
                                    }
                                    rod.i(b2);
                                    Handler handler = py0.s0;
                                    gwe gwe = py0.J0;
                                    handler.removeCallbacks(gwe);
                                    py0.u0.b.getClass();
                                    handler.postDelayed(gwe, (long) 30000);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
        }
    }
}
