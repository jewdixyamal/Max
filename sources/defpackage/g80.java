package defpackage;

import android.accounts.Account;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: g80  reason: default package */
public final class g80 extends e3 {
    public final void c() {
        LinkedHashMap n = n();
        super.c();
        p(n);
    }

    public final LinkedHashMap n() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String g = g("auth.token.external.cache", (String) null);
        if (g != null) {
            linkedHashMap = new LinkedHashMap();
            try {
                JSONObject jSONObject = new JSONObject(g);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    linkedHashMap.put(next, jSONObject.getString(next));
                }
            } catch (JSONException e) {
                hm9.p(this.e, "getStringMap: failed", e);
            }
        }
        return linkedHashMap;
    }

    public final void o(Account account, String str, boolean z) {
        if (account != null) {
            m("auth.account.name", account.name);
        }
        m("auth.token", str);
        j("auth.account.external", z);
        if (z) {
            String g = g("auth.account.name", (String) null);
            if (g == null || g.length() == 0 || str.length() == 0) {
                hm9.p(this.e, "cacheExternalToken: rejected", (Throwable) null);
                return;
            }
            LinkedHashMap n = n();
            n.put(g, str);
            p(n);
        }
    }

    public final void p(LinkedHashMap linkedHashMap) {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                jSONObject.put((String) entry.getKey(), entry.getValue());
            }
            m("auth.token.external.cache", jSONObject.toString());
        } catch (JSONException e) {
            hm9.p(this.e, "putStringMap: failed", e);
        }
    }
}
