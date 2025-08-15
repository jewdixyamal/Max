package defpackage;

import android.content.Intent;
import android.hardware.camera2.CaptureResult;
import android.media.MediaDrmException;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.webrtc.protocol.exceptions.RtcCommandException;

/* renamed from: sp3  reason: default package */
public final class sp3 implements l30, s43, j55, ele, fu3, fd6, pv1, t65, h78, noc, j8e, kx3 {
    public static final sp3 X = new Object();
    public static final sp3 Y = new Object();
    public static final sp3 Z = new Object();
    public static final sp3 a = new Object();
    public static final sp3 b = new Object();
    public static final sp3 c = new Object();
    public static final sp3 o = new Object();
    public static final sp3 s0 = new Object();
    public static final sp3 t0 = new Object();
    public static final sp3 u0 = new Object();
    public static final /* synthetic */ sp3 v0 = new Object();

    public static roc C(JSONObject jSONObject) {
        String string = jSONObject.getString("response");
        string.getClass();
        Integer num = null;
        if (string.equals("report-perf-stat")) {
            if (jSONObject.has("estimatedPerformanceIndex")) {
                num = Integer.valueOf(jSONObject.getInt("estimatedPerformanceIndex"));
            }
            return new fhc(num);
        } else if (!string.equals("update-display-layout")) {
            return null;
        } else {
            if (!jSONObject.has("errorCodeByParticipantId")) {
                return new f6f(Collections.emptyMap());
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("errorCodeByParticipantId");
            HashMap hashMap = new HashMap();
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(f46.Z(next), jSONObject2.getInt(next) == -1 ? e6f.b : e6f.a);
            }
            return new f6f(hashMap);
        }
    }

    public static JSONObject D(long j, hoc hoc) {
        String str;
        if (hoc instanceof ehc) {
            ehc ehc = (ehc) hoc;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("framesReceived", ehc.a);
            jSONObject.put("framesDecoded", ehc.b);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("sequence", j);
            jSONObject2.put("command", (Object) "report-perf-stat");
            jSONObject2.put("report", (Object) jSONObject);
            return jSONObject2;
        } else if (hoc instanceof d6f) {
            d6f d6f = (d6f) hoc;
            JSONObject jSONObject3 = new JSONObject();
            for (m7d m7d : d6f.a) {
                l7d l7d = m7d.b;
                if (l7d.a) {
                    str = "ss";
                } else {
                    str = "sz=" + l7d.b + "x" + l7d.c + ":fit=" + k7d.b(l7d.d);
                }
                jSONObject3.put(f46.P(m7d), (Object) str);
            }
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("sequence", j);
            jSONObject4.put("command", (Object) "update-display-layout");
            jSONObject4.put("layouts", (Object) jSONObject3);
            if (d6f.b) {
                jSONObject4.put("snapshot", true);
            }
            return jSONObject4;
        } else if (hoc instanceof nhc) {
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("sequence", j);
            jSONObject5.put("command", (Object) "request-asr");
            jSONObject5.put("start", ((nhc) hoc).a);
            return jSONObject5;
        } else if (!(hoc instanceof chc)) {
            return null;
        } else {
            chc chc = (chc) hoc;
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("sequence", j);
            jSONObject6.put("command", (Object) "report-network-stat");
            jSONObject6.put("timestamp", chc.a);
            jSONObject6.put("bitrate", chc.b);
            return jSONObject6;
        }
    }

    public mv1 A() {
        return mv1.a;
    }

    public sh0 W(long j, hoc hoc) {
        if (hoc != null) {
            try {
                JSONObject D = D(j, hoc);
                if (D != null) {
                    return new sh0(1, D.toString().getBytes());
                }
                Long valueOf = Long.valueOf(j);
                throw new RtcCommandException(valueOf, false, new IllegalStateException("No serializer for command: " + hoc.getClass()));
            } catch (JSONException e) {
                Long valueOf2 = Long.valueOf(j);
                throw new RtcCommandException(valueOf2, false, new IllegalArgumentException("Unable to serialize command: " + hoc.getClass(), e));
            }
        } else {
            throw new RtcCommandException(Long.valueOf(j), false, new IllegalArgumentException("Illegal 'command' value: null"));
        }
    }

    public Map a(byte[] bArr) {
        throw new IllegalStateException();
    }

    public nje c() {
        return nje.b;
    }

    public r65 d() {
        throw new IllegalStateException();
    }

    public long e() {
        throw new NoSuchElementException();
    }

    public qz3 f(byte[] bArr) {
        throw new IllegalStateException();
    }

    public byte[] g() {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    public long getTimestamp() {
        return -1;
    }

    public long h() {
        throw new NoSuchElementException();
    }

    public boolean i(byte[] bArr, String str) {
        throw new IllegalStateException();
    }

    public void j(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    public void k(byte[] bArr) {
    }

    public byte[] l(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    public void m(byte[] bArr) {
        throw new IllegalStateException();
    }

    public p65 n(byte[] bArr, List list, int i, HashMap hashMap) {
        throw new IllegalStateException();
    }

    public boolean next() {
        return false;
    }

    public int o() {
        return 1;
    }

    public long p(int i, long j, float f) {
        long j2;
        if (j <= 0) {
            return System.currentTimeMillis();
        }
        if (i > 10) {
            j2 = (long) 300000;
        } else {
            hm9.m("sp3", "errorCount = %d^2 * 3 * 1000", Integer.valueOf(i));
            j2 = (long) (i * i * 3000);
        }
        return j2 + j;
    }

    public nv1 r() {
        return nv1.a;
    }

    public void release() {
    }

    public int s() {
        return 1;
    }

    public g03 t(int i, byte[] bArr) {
        if (i == 0) {
            throw new RtcCommandException((Long) null, false, new IllegalArgumentException("Illegal 'format' value: null"));
        } else if (i == 1) {
            try {
                String str = new String(bArr);
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    try {
                        Long valueOf = jSONObject.has("sequence") ? Long.valueOf(jSONObject.getLong("sequence")) : null;
                        String string = jSONObject.has("type") ? jSONObject.getString("type") : null;
                        if ("response".equals(string)) {
                            if (valueOf != null) {
                                try {
                                    roc C = C(jSONObject);
                                    if (C == null) {
                                        return null;
                                    }
                                    return new g03(valueOf.longValue(), (Object) C, 8);
                                } catch (Throwable th) {
                                    throw new RtcCommandException(valueOf, false, new IllegalArgumentException("Unable to decode response body: ".concat(str), th));
                                }
                            } else {
                                throw new RtcCommandException(valueOf, false, new IllegalArgumentException("Unable to decode response id: ".concat(str)));
                            }
                        } else if (!"error".equals(string)) {
                            return null;
                        } else {
                            jSONObject.optString("error", "");
                            boolean optBoolean = jSONObject.optBoolean("recoverable", false);
                            HashMap hashMap = new HashMap();
                            Iterator<String> keys = jSONObject.keys();
                            while (keys.hasNext()) {
                                String next = keys.next();
                                String optString = jSONObject.optString(next);
                                if (optString != null) {
                                    hashMap.put(next, optString);
                                }
                            }
                            throw new RtcCommandException(valueOf, optBoolean, (Throwable) null);
                        }
                    } catch (Throwable th2) {
                        throw new RtcCommandException((Long) null, false, new IllegalArgumentException("Unable to decode response id/type: ".concat(str), th2));
                    }
                } catch (Throwable th3) {
                    throw new RtcCommandException((Long) null, false, new IllegalArgumentException("Unable to decode response as json: ".concat(str), th3));
                }
            } catch (Throwable th4) {
                throw new RtcCommandException((Long) null, false, new IllegalArgumentException("Unable to decode response as string", th4));
            }
        } else {
            throw new RtcCommandException((Long) null, false, new UnsupportedOperationException("Only text format is supported"));
        }
    }

    public Object u(Task task) {
        Intent intent = (Intent) ((Bundle) task.f()).getParcelable("notification_data");
        if (intent != null) {
            return new r43(intent);
        }
        return null;
    }

    public lv1 v() {
        return lv1.a;
    }

    public gle w(gy8 gy8) {
        int i;
        String str;
        if (!gy8.m()) {
            return new xm3((wm3) null);
        }
        try {
            i = lz7.N(gy8);
        } catch (Throwable th) {
            hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
            Iterator it = u7d.a.iterator();
            while (it.hasNext()) {
                ((r4a) it.next()).getClass();
                r4a.a(th);
            }
            int s = au1.s(k7d.a);
            if (s == 0) {
                i = 0;
            } else if (s != 1) {
                throw new NoWhenBranchMatchedException();
            } else {
                throw th;
            }
        }
        if (i == 0) {
            return new xm3((wm3) null);
        }
        wm3 wm3 = null;
        for (int i2 = 0; i2 < i; i2++) {
            try {
                str = lz7.P(gy8);
            } catch (Throwable th2) {
                hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th2);
                Iterator it2 = u7d.a.iterator();
                while (it2.hasNext()) {
                    ((r4a) it2.next()).getClass();
                    r4a.a(th2);
                }
                int s2 = au1.s(k7d.a);
                if (s2 == 0) {
                    str = null;
                } else if (s2 != 1) {
                    throw new NoWhenBranchMatchedException();
                } else {
                    throw th2;
                }
            }
            if (str != null) {
                if (str.equals("contact")) {
                    try {
                        wm3 = wm3.e(gy8);
                    } catch (Throwable th3) {
                        hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th3);
                        Iterator it3 = u7d.a.iterator();
                        while (it3.hasNext()) {
                            ((r4a) it3.next()).getClass();
                            r4a.a(th3);
                        }
                        int s3 = au1.s(k7d.a);
                        if (s3 == 0) {
                            wm3 = null;
                        } else if (s3 != 1) {
                            throw new NoWhenBranchMatchedException();
                        } else {
                            throw th3;
                        }
                    }
                } else {
                    try {
                        gy8.z();
                    } catch (Throwable th4) {
                        hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th4);
                        Iterator it4 = u7d.a.iterator();
                        while (it4.hasNext()) {
                            ((r4a) it4.next()).getClass();
                            r4a.a(th4);
                        }
                        int s4 = au1.s(k7d.a);
                        if (s4 != 0) {
                            if (s4 != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            throw th4;
                        }
                    }
                }
            }
        }
        return new xm3(wm3);
    }

    public void x(wd6 wd6) {
    }

    public CaptureResult y() {
        return null;
    }
}
