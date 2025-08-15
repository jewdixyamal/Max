package defpackage;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import org.apache.http.cookie.ClientCookie;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: ab4  reason: default package */
public final /* synthetic */ class ab4 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bb4 b;

    public /* synthetic */ ab4(bb4 bb4, int i) {
        this.a = i;
        this.b = bb4;
    }

    public final Object call() {
        Base64OutputStream base64OutputStream;
        GZIPOutputStream gZIPOutputStream;
        String byteArrayOutputStream;
        switch (this.a) {
            case 0:
                bb4 bb4 = this.b;
                synchronized (bb4) {
                    try {
                        nj6 nj6 = (nj6) bb4.a.get();
                        ArrayList c = nj6.c();
                        nj6.b();
                        JSONArray jSONArray = new JSONArray();
                        for (int i = 0; i < c.size(); i++) {
                            oa0 oa0 = (oa0) c.get(i);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("agent", (Object) oa0.a);
                            jSONObject.put("dates", (Object) new JSONArray((Collection<?>) oa0.b));
                            jSONArray.put((Object) jSONObject);
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("heartbeats", (Object) jSONArray);
                        jSONObject2.put(ClientCookie.VERSION_ATTR, (Object) "2");
                        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                        base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
                        gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                        gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                        gZIPOutputStream.close();
                        base64OutputStream.close();
                        byteArrayOutputStream = byteArrayOutputStream2.toString("UTF-8");
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return byteArrayOutputStream;
            default:
                bb4 bb42 = this.b;
                synchronized (bb42) {
                    ((nj6) bb42.a.get()).h(System.currentTimeMillis(), ((ef4) bb42.c.get()).a());
                }
                return null;
        }
        throw th;
        throw th;
    }
}
