package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: c5c  reason: default package */
public final class c5c implements bnd {
    public final HashSet a = new HashSet();

    public final void onRateCall(JSONObject jSONObject) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((bnd) it.next()).onRateCall(jSONObject);
        }
    }
}
