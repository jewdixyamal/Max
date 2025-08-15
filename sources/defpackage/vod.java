package defpackage;

import org.json.JSONObject;

/* renamed from: vod  reason: default package */
public final class vod implements uod {
    public final oq0 a;

    public vod(oq0 oq0) {
        this.a = oq0;
    }

    public final JSONObject a() {
        JSONObject put = new JSONObject().put("command", (Object) "update-media-modifiers");
        oq0 oq0 = this.a;
        oq0.getClass();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("denoise", oq0.a);
            jSONObject.put("denoiseAnn", oq0.b);
        } catch (Exception unused) {
        }
        return put.put("mediaModifiers", (Object) jSONObject);
    }
}
