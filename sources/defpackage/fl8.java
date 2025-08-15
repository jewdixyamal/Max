package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: fl8  reason: default package */
public final /* synthetic */ class fl8 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gl8 b;

    public /* synthetic */ fl8(gl8 gl8, int i) {
        this.a = i;
        this.b = gl8;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                gl8 gl8 = this.b;
                String str = gl8.a;
                if (str == null) {
                    return null;
                }
                try {
                    return new JSONObject(str);
                } catch (JSONException e) {
                    hm9.p(gl8.b, "Failed to parse media transform params", e);
                    return null;
                }
            case 1:
                JSONObject jSONObject = (JSONObject) this.b.c.getValue();
                boolean z = false;
                if (jSONObject != null) {
                    z = jSONObject.optBoolean("enabled", false);
                }
                return Boolean.valueOf(z);
            case 2:
                JSONObject jSONObject2 = (JSONObject) this.b.c.getValue();
                boolean z2 = false;
                if (jSONObject2 != null) {
                    z2 = jSONObject2.optBoolean("hevc_enabled", false);
                }
                return Boolean.valueOf(z2);
            default:
                JSONObject jSONObject3 = (JSONObject) this.b.c.getValue();
                boolean z3 = false;
                if (jSONObject3 != null) {
                    z3 = jSONObject3.optBoolean("hdr_enabled", false);
                }
                return Boolean.valueOf(z3);
        }
    }
}
