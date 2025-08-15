package defpackage;

import java.net.URL;
import org.json.JSONObject;

/* renamed from: ox4  reason: default package */
public final class ox4 {
    public final URL a;
    public final JSONObject b;

    public ox4(JSONObject jSONObject, String str) {
        Object obj;
        this.a = new URL(str);
        this.b = jSONObject;
        jSONObject.optInt("width");
        jSONObject.optInt("height");
        String optString = jSONObject.optString("staticUrl");
        if (optString != null) {
            try {
                obj = new URL(optString);
            } catch (Throwable th) {
                obj = new njc(th);
            }
            URL url = (URL) (obj instanceof njc ? null : obj);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ox4)) {
            return false;
        }
        ox4 ox4 = (ox4) obj;
        return tpa.f(this.a, ox4.a) && tpa.f(this.b, ox4.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        JSONObject jSONObject = this.b;
        return hashCode + (jSONObject == null ? 0 : jSONObject.hashCode());
    }

    public final String toString() {
        return "Animation(url=" + this.a + ", otherProperties=" + this.b + ")";
    }
}
